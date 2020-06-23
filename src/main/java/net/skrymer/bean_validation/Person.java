package net.skrymer.bean_validation;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.List;

public class Person {
  private Name name;
  private List<@NotBlank(message = "Pet name must not be blank") String> petNames;

  public Name getName() {
    return name;
  }

  public void setName(@Valid Name name) {
    this.name = name;
  }

  public List<String> getPetNames() {
    return petNames;
  }

  public void setPetNames(List<String> petNames) {
    this.petNames = petNames;
  }
}
