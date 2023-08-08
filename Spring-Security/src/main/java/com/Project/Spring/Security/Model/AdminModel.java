package com.Project.Spring.Security.Model;

import com.Project.Spring.Security.Entities.Admin;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminModel {

    private long id;
    private String name;
    private String email;

    public AdminModel(Admin admin){
        this.setId(admin.getId());
        this.setName(admin.getName());
        this.setEmail(admin.getEmail());
    }

    public Admin dissamble(){

        Admin admin =new Admin();
        admin.setId(id);
        admin.setName(name);
        admin.setEmail(email);

        return admin;
    }
}
