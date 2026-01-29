package org.example.domain;

import java.time.LocalDate;

public class JobApplication {

  private Long id;
  private String companyName;
  private ApplicationSite site;
  private LocalDate appliedDate;
  private ApplicationStatus status;
  private String memo;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public ApplicationSite getSite() {
    return site;
  }

  public void setSite(ApplicationSite site) {
    this.site = site;
  }

  public LocalDate getAppliedDate() {
    return appliedDate;
  }

  public void setAppliedDate(LocalDate appliedDate) {
    this.appliedDate = appliedDate;
  }

  public ApplicationStatus getStatus() {
    return status;
  }

  public void setStatus(ApplicationStatus status) {
    this.status = status;
  }

  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }
}
