package com.learning.LibraryManagementSystem.Service;

import com.learning.LibraryManagementSystem.Entity.Book;
import com.learning.LibraryManagementSystem.Entity.User;
import com.learning.LibraryManagementSystem.Repository.BookRepo;
import com.learning.LibraryManagementSystem.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepo bookRepo;
        public List<Book> findAll() {
        return bookRepo.findAll();
    }

    public Book findById(Long id) {
        return bookRepo.findById(id).orElse(null);
    }

    public Book save(Book book) {
        return bookRepo.save(book);
    }

    public void deleteById(Long id) {
        bookRepo.deleteById(id);
    }




}
