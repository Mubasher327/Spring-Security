package com.Project.Spring.Security.Model;

import com.Project.Spring.Security.Entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserModel {
    private long id;
    private String name;
    private String email;


    public UserModel (User user){
        this.setId(user.getId());
        this.setName(user.getName());
        this.setEmail(user.getEmail());

    }

    public User dissamble(){
        User user =new User();
        user.setId(id);
        user.setName(name);
        user.setEmail(email);

        return user;
    }

}
