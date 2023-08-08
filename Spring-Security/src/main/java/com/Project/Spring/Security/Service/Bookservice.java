package com.Project.Spring.Security.Service;

import com.Project.Spring.Security.Entities.Admin;
import com.Project.Spring.Security.Entities.Books;
import com.Project.Spring.Security.Entities.User;
import com.Project.Spring.Security.Model.BookModel;
import com.Project.Spring.Security.Model.UserModel;
import com.Project.Spring.Security.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class Bookservice {

    @Autowired
    BookRepository bookRepository;

    public BookModel addBook(BookModel books){
        return new BookModel(bookRepository.save(books.dissamble()));
    }

    public List<BookModel> getBooks() {
        return bookRepository.findAll().stream().map(BookModel::new).collect(Collectors.toList());
    }

    public Books getBookById(long id) {
        return bookRepository.findById(id).get();
    }

//    public Books getBookById(long id){
//        return bookRepository.findById(id).get();
//    }
//
//    public List<BookModel> findBook(Long id, String name){
//        List<BookModel>bookModels = new ArrayList<>();
//        if(id!=null){
//            bookModels=bookRepository.findBookByBook_Id(id)
//                    .stream()
//                    .map(BookModel::new)
//                    .collect(Collectors.toList());
//        } else if (name!=null) {
//            bookModels=bookRepository.findBookByBook_Name(name)
//                    .stream()
//                    .map(BookModel::new)
//                    .collect(Collectors.toList());
//        }else {
//            bookModels=bookRepository.findAll().stream().map(BookModel::new).collect(Collectors.toList());
//        }
//
//        return bookModels;
//    }
}
