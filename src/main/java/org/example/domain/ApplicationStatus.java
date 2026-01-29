package org.example.domain;

public enum ApplicationStatus {

  APPLIED("応募済み"),
  DOCUMENT_REVIEW("書類（履歴書）選考中"),
  MEETING_RESERVED("面談予約済み"),
  INTERVIEW_RESERVED("面接予約済み"),
  INTERVIEW_COMPLETED("面接完了"),
  COMPLETED("完了");

  private final String label;

  ApplicationStatus(String label) {
    this.label = label;
  }

  public String getLabel() {
    return label;
  }
}
