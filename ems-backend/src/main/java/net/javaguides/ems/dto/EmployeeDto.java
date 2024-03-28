package net.javaguides.ems.dto;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor //generates a constructor with no argument
@AllArgsConstructor //generates a constructor with arguments
public class EmployeeDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
