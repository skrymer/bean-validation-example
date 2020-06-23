package net.skrymer.bean_validation;

import javax.validation.constraints.NotEmpty;

public class Name {

  @NotEmpty(message = "first name must not be empty")
  private String first;

  private String middle;

  @NotEmpty(message = "last name must not be empty")
  private String last;

  public String getFirst() {
    return first;
  }

  public void setFirst(String first) {
    this.first = first;
  }

  public String getLast() {
    return last;
  }

  public void setLast(String last) {
    this.last = last;
  }
}
