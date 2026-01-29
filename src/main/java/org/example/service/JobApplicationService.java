package org.example.service;

import java.util.List;

import org.example.domain.JobApplication;
import org.example.repository.JobApplicationMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class JobApplicationService {

  private final JobApplicationMapper mapper;

  public JobApplicationService(JobApplicationMapper mapper) {
    this.mapper = mapper;
  }

  public List<JobApplication> findAll() {
    return mapper.findAll();
  }

  public JobApplication findById(Long id) {
    return mapper.findById(id);
  }

  @Transactional
  public void create(JobApplication jobApplication) {
    mapper.insert(jobApplication);
  }

  @Transactional
  public void update(JobApplication jobApplication) {
    mapper.update(jobApplication);
  }
}
