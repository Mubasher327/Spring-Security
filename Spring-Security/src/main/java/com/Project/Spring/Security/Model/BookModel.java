package com.Project.Spring.Security.Model;

import com.Project.Spring.Security.Entities.Books;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookModel {

    private long id;
    private String title;
    private String authorName;

    public BookModel (Books books){

        this.setId(books.getId());
        this.setTitle(books.getTitle());
        this.setAuthorName(books.getAuthorName());
    }

    public Books dissamble(){

        Books books=new Books();
        books.setId(id);
        books.setTitle(title);
        books.setAuthorName(authorName);
        return books;
    }
}
