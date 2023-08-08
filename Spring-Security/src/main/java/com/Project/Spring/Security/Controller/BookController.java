package com.Project.Spring.Security.Controller;

import com.Project.Spring.Security.Entities.Book;
import com.Project.Spring.Security.Model.BookModel;
import com.Project.Spring.Security.Service.Bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Books")
public class BookController {

    @Autowired
    Bookservice bookservice;



    @GetMapping("/list")
    public List<BookModel> getBookList(){
        return bookservice.getBooks();
    }
    @GetMapping("/get/{id}")
    public Book getBookByid(@PathVariable(name = "id")long Id){
        return bookservice.getBookById(Id);
    }

//    @GetMapping("/search")
//    private List<BookModel> getBookById(@RequestParam(name = "id",required = false)Long id , @RequestParam(name = "name",required = false)String name){
//        return bookservice.findBook(id,name);
//    }
}
