package org.mentorbridge.controller;

import org.mentorbridge.dto.EmployeeDTO;
import org.mentorbridge.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public EmployeeDTO addEmployee(@RequestBody EmployeeDTO employeeDTO) {
        System.out.println("Employee added: " + employeeDTO);
        return employeeService.addEmployee(employeeDTO);
    }

    @GetMapping("/get/{id}")
    public EmployeeDTO getEmployee(@PathVariable Long id) {
        return employeeService.getEmployee(id);
    }
}
