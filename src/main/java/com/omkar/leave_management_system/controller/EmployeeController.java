package com.omkar.leave_management_system.controller;

import com.omkar.leave_management_system.entity.Employee;
import com.omkar.leave_management_system.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/employees")

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee saveEmployee(@Valid @RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}