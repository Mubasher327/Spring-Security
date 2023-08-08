package com.Project.Spring.Security.Service;

import com.Project.Spring.Security.Entities.User;
import com.Project.Spring.Security.Model.UserModel;
import com.Project.Spring.Security.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<User> getEmployee() {
        return userRepository.findAll();
    }

    public UserModel createUser(UserModel userModel) {
      //  user.setPassword(passwordEncoder.encode(user.getPassword()));
        return new UserModel(userRepository.save(userModel.dissamble()));
    }

}