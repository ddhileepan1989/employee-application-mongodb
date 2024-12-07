package org.mentorbridge.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "EMPLOYEE")
@Builder
@AllArgsConstructor
@Data
public class EmployeeEntity {

    @Transient
    public static final String EMPLOYEE_SEQUENCE = "employee_sequence";

    @Id
    long id;
    String firstName;
    String lastName;
    String email;
    String phone;
    String role;

    public EmployeeEntity() {

    }
}
