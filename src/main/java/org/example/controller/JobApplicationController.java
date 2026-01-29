package org.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.example.domain.ApplicationSite;
import org.example.domain.ApplicationStatus;
import org.example.domain.JobApplication;
import org.example.service.JobApplicationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JobApplicationController {

  private final JobApplicationService service;

  public JobApplicationController(JobApplicationService service) {
    this.service = service;
  }

  @ModelAttribute("sites")
  public ApplicationSite[] sites() {
    return ApplicationSite.values();
  }

  @ModelAttribute("statuses")
  public ApplicationStatus[] statuses() {
    return ApplicationStatus.values();
  }

  @GetMapping("/")
  public String list(Model model) {
    List<JobApplication> applications = service.findAll();

    if (applications == null) {
      applications = new ArrayList<>();
    }

    model.addAttribute("applications", applications);
    return "list";
  }

  @GetMapping("/jobApplications/new")
  public String newJobApplication(Model model) {
    model.addAttribute("jobApplication", new JobApplication());
    return "jobApplicationForm";
  }

  @PostMapping("/jobApplications")
  public String createJobApplication(JobApplication jobApplication) {
    service.create(jobApplication);
    return "redirect:/";
  }

  @GetMapping("/jobApplications/{id}/edit")
  public String editJobApplication(@PathVariable Long id, Model model) {
    JobApplication jobApplication = service.findById(id);
    model.addAttribute("jobApplication", jobApplication);
    return "jobApplicationForm";
  }

  @PostMapping("/jobApplications/{id}")
  public String updateJobApplication(
      @PathVariable Long id,
      JobApplication jobApplication) {

    jobApplication.setId(id);
    service.update(jobApplication);
    return "redirect:/";
  }
}
