package com.Project.Spring.Security.Model;

import com.Project.Spring.Security.Entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeModel {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    public EmployeeModel(Employee employee){

        this.setId(employee.getId());
        this.setFirstName(employee.getFirstName());
        this.setLastName(employee.getLastName());
        this.setEmail(employee.getEmail());

    }
    public Employee dissamble(){
        Employee employee =new Employee();
        employee.setId(id);
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setEmail(email);
        return employee;
    }
}
