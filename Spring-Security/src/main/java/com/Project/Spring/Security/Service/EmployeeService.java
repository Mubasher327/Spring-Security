package com.Project.Spring.Security.Service;

import com.Project.Spring.Security.Entities.Employee;
import com.Project.Spring.Security.Repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }

    public Employee createEmploye(Employee employee) {
        employee.setId(UUID.randomUUID().toString());
        employee.setPassword(passwordEncoder.encode(employee.getPassword()));
        return employeeRepository.save(employee);
    }

}
