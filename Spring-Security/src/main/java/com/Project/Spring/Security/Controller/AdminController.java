package com.Project.Spring.Security.Controller;

import com.Project.Spring.Security.Entities.Admin;
import com.Project.Spring.Security.Entities.User;
import com.Project.Spring.Security.Model.AdminModel;
import com.Project.Spring.Security.Model.BookModel;
import com.Project.Spring.Security.Model.UserModel;
import com.Project.Spring.Security.Repositories.AdminRepository;
import com.Project.Spring.Security.Service.AdminService;
import com.Project.Spring.Security.Service.Bookservice;
import com.Project.Spring.Security.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Admin")
public class AdminController {

    @Autowired
    AdminService adminService;
    @Autowired
    Bookservice bookservice;
    @Autowired
    UserService userService;

    @PostMapping
    public String createAdmin(@RequestBody AdminModel admin){
        adminService.createAdmin(admin);
        return "Successfully admin created";
    }

    @PostMapping("/create-user")
    public String  createUser(@RequestBody UserModel user){
       userService.createUser(user);
        return "Successfully user created";

    }
    @PostMapping("/add-book")
    public String addbooks(@RequestBody BookModel books){
        bookservice.addBook(books);
        return "Book add Successfully";
    }

    @GetMapping("/list")
    public List<AdminModel> getAdminList(){
        return adminService.getAdmin();
    }
    @GetMapping("/books/list")
    public List<BookModel> getBookList(){
        return bookservice.getBooks();
    }

    @GetMapping("/get/{id}")
    public Admin getAdminByid(@PathVariable(name = "id")long Id){
        return adminService.gatAdminById(Id);
    }
}
