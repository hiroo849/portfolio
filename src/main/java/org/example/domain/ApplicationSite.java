package org.example.domain;

public enum ApplicationSite {

  DoDA("doda"),
  MYNAVI("マイナビ"),
  LEVTECH("レバテック"),
  OTHER("その他");

  private final String label;

  ApplicationSite(String label){
    this.label = label;
  }

  public String getLabel() {
    return label;
  }
}
