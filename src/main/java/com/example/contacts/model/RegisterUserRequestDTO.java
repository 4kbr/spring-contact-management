package com.example.contacts.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class RegisterUserRequestDTO {
  @NotBlank
  @Size(max = 100)
  private String username;
  @NotBlank
  @Size(max = 100)
  private String password;
  @NotBlank
  @Size(max = 100)
  private String name;

}
