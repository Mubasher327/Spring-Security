package com.Project.Spring.Security.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="book-id")
    private long id;

    @Column(name="book-name")
    private String title;

    @Column(name="author-name")
    private String authorName;
}
