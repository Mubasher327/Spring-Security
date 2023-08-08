package com.Project.Spring.Security.Entities;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="admin-Id")
    private long id;

    @Column(name="admin-name")
    private String name;

    @Column(name="admin-email")
    private String email;

//    @OneToMany(mappedBy = "user")
//    private List<User> users;


}
