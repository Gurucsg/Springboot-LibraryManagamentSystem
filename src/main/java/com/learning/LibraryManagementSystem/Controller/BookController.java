package com.learning.LibraryManagementSystem.Controller;

import com.learning.LibraryManagementSystem.Entity.Book;
import com.learning.LibraryManagementSystem.Service.BookService;
import com.learning.LibraryManagementSystem.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private UserService userService;
    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.findAll();
    }
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable long id){
        return bookService.findById(id);
    }
    @PostMapping
    public Book SaveBook(@RequestBody Book book){
         return bookService.save(book);
    }
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable long id){
        bookService.deleteById(id);
    }
    @PutMapping("/{id}")
    public Book updatebook(@PathVariable long id,@RequestBody Book book){
        bookService.deleteById(id);
        return bookService.save(book);
    }



}
