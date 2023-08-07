package com.Project.Spring.Security.Controller;

import com.Project.Spring.Security.Entities.Employee;
import com.Project.Spring.Security.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/get")
    public List<Employee> getEmployee(){
        System.out.println("Get Employees");
        return employeeService.getEmployee();
    }

    @GetMapping("/current-employee")
    public String getLoggedInEmployee(Principal principal){

        return principal.getName();
    }

}
