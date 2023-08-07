package com.Project.Spring.Security.Repositories;

import com.Project.Spring.Security.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,String> {

    public Optional<Employee> findByEmail(String email);
}
