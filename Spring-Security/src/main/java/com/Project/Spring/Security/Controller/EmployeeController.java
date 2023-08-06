package com.Project.Spring.Security.Controller;

import com.Project.Spring.Security.Entity.Employee;
import com.Project.Spring.Security.Model.EmployeeModel;
import com.Project.Spring.Security.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @PostMapping("/save")
    public String  addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
        return "save";
    }

    @GetMapping("/list")
    public List<EmployeeModel> getEmployeelist()
    {
        return employeeService.getAllEmployee();
    }
    @GetMapping("/ById/{id}")
    public Employee getBooks(@PathVariable("id") long empl_id)
    {

        return employeeService.getEmployeeById(empl_id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable("id") long id){
        return employeeService.deleteById(id);
    }
}
