package com.Project.Spring.Security.Model;

import com.Project.Spring.Security.Entities.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookModel {

    private long id;
    private long isbn;
    private String title;
    private String authorName;
    private String category;

    public BookModel (Book book){

        this.setId(book.getId());
        this.setIsbn(book.getIsbn());
        this.setTitle(book.getTitle());
        this.setAuthorName(book.getAuthorName());
        this.setCategory(book.getCategory());
    }

    public Book dissamble(){

        Book book =new Book();
        book.setId(id);
        book.setIsbn(isbn);
        book.setTitle(title);
        book.setAuthorName(authorName);
        book.setCategory(category);
        return book;
    }
}
