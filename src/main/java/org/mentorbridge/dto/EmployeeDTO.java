package org.mentorbridge.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class EmployeeDTO {

    long empId;
    String firstName;
    String lastName;
    String email;
    String phone;
}
