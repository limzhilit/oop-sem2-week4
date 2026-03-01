package ie.atu.oopsem2week4.model;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Candidate {

  private long id;

  private String name;

  @Min(value = 5, message = "Age must be at least 5")
  @Max(value = 100, message = "Age must not exceed 100")
  private int age;

  @Pattern(regexp = "^\\+?[0-9]{7,15}$", message = "Phone number must be valid")
  private String phone;

}