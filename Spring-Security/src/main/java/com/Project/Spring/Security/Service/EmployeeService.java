package com.Project.Spring.Security.Service;
import com.Project.Spring.Security.Entity.Employee;
import com.Project.Spring.Security.Model.EmployeeModel;
import com.Project.Spring.Security.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public String addEmployee(Employee employee){
        employeeRepository.save(employee);
        return "save Successfully";
    }

    public List<EmployeeModel> getAllEmployee(){
        return employeeRepository.findAll().stream().map(EmployeeModel::new).collect(Collectors.toList());
    }

    public Employee getEmployeeById(long id)
    {
        return employeeRepository.findById(id).get();
    }

    public String deleteById(long id) {
        employeeRepository.deleteById(id);
        return "Successfully deleted";
    }
}
