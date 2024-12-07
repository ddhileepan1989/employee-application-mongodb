package org.mentorbridge.service;

import org.mentorbridge.dto.EmployeeDTO;
import org.mentorbridge.entity.EmployeeEntity;
import org.mentorbridge.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    public EmployeeDTO addEmployee(EmployeeDTO employeeDTO) {

        EmployeeEntity employeeEntity = EmployeeEntity.builder()
                .id(sequenceGeneratorService.generateSequence(EmployeeEntity.EMPLOYEE_SEQUENCE))
                .firstName(employeeDTO.getFirstName())
                .lastName(employeeDTO.getLastName())
                .email(employeeDTO.getEmail())
                .phone(employeeDTO.getPhone())
                .role("Developer")
                .build();

        EmployeeEntity employeeEntity1 = employeeRepository.save(employeeEntity);

        return EmployeeDTO.builder().empId(employeeEntity1.getId()).build();
    }

    public EmployeeDTO getEmployee(long id) {
        EmployeeEntity entity = employeeRepository.findById(id);
        return EmployeeDTO.builder()
                .empId(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .email(entity.getEmail())
                .phone(entity.getPhone())
                .build();
    }
}
