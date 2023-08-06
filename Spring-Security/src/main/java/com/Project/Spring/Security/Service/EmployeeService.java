package com.Project.Spring.Security.Service;

import com.Project.Spring.Security.Model.Employee;
import org.springframework.security.config.web.server.ServerSecurityMarker;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    private List<Employee> save= new ArrayList<>();

    public EmployeeService(){
        save.add(new Employee(UUID.randomUUID().toString(),"Mubasher","mubasher@gmail.com"));
        save.add(new Employee(UUID.randomUUID().toString(),"Kashaf","Kashaf@gmail.com"));

    }

    public List<Employee>getEmployee(){
        return this.save;
    }

}
