package org.example.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Options;

import org.example.domain.JobApplication;

@Mapper
public interface JobApplicationMapper {

  @Select("SELECT * FROM job_applications ORDER BY applied_date DESC")
  List<JobApplication> findAll();

  @Select("SELECT * FROM job_applications WHERE id = #{id}")
  JobApplication findById(Long id);

  @Insert("""
    INSERT INTO job_applications
    (company_name, site, applied_date, status, memo)
    VALUES
    (#{companyName}, #{site}, #{appliedDate}, #{status}, #{memo})
  """)
  @Options(useGeneratedKeys = true, keyProperty = "id")
  void insert(JobApplication jobApplication);

  @Update("""
    UPDATE job_applications
    SET
      company_name = #{companyName},
      site = #{site},
      applied_date = #{appliedDate},
      status = #{status},
      memo = #{memo}
    WHERE id = #{id}
  """)
  void update(JobApplication jobApplication);
}
