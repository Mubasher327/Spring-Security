package com.Project.Spring.Security.Service;

import com.Project.Spring.Security.Entities.Admin;
import com.Project.Spring.Security.Model.AdminModel;
import com.Project.Spring.Security.Repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdminService {

    @Autowired
    AdminRepository adminRepository;

    public AdminModel createAdmin(AdminModel admin){
        return new AdminModel(adminRepository.save(admin.dissamble()));
    }

    public List<AdminModel> getAdmin(){
        return adminRepository.findAll().stream().map(AdminModel::new).collect(Collectors.toList());
    }

    public Admin gatAdminById(long id){
        return adminRepository.findById(id).get();
    }
}
