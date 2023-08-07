package com.Project.Spring.Security.Service;

import com.Project.Spring.Security.Entities.Employee;
import com.Project.Spring.Security.Repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomEmployeeDetailService implements UserDetailsService {
    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
     //   Employee employee = employeeRepository.findByEmail(username).orElseThrow(() -> new RuntimeException("Employee not found!!"));
        return null;
    }
}
