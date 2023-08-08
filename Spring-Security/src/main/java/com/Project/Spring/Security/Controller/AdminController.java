package com.Project.Spring.Security.Controller;

import com.Project.Spring.Security.Entities.Admin;
import com.Project.Spring.Security.Entities.User;
import com.Project.Spring.Security.Model.AdminModel;
import com.Project.Spring.Security.Model.BookModel;
import com.Project.Spring.Security.Repositories.AdminRepository;
import com.Project.Spring.Security.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @PostMapping
    public String createAdmin(@RequestBody AdminModel admin){
        adminService.createAdmin(admin);
        return "Successfully admin created";
    }

    @GetMapping("/list")
    public List<AdminModel> getAdminList(){
        return adminService.getAdmin();
    }

    @GetMapping("/get/{id}")
    public Admin getAdminByid(@PathVariable(name = "id")long Id){
        return adminService.gatAdminById(Id);
    }
}
