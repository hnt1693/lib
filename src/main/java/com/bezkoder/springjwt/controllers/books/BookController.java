package com.bezkoder.springjwt.controllers.books;

import com.bezkoder.springjwt.models.Book;
import com.bezkoder.springjwt.models.TypeOfBook;
import com.bezkoder.springjwt.services.BookService;
import com.bezkoder.springjwt.services.TypeOfBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/book")
@RestController
@CrossOrigin(allowedHeaders = "*")
public class BookController {
    @Autowired
    private BookService bookService;

    @Autowired
    private TypeOfBookService typeOfBookService;

    @GetMapping(value = "/all")
    public List<Book> findAll() {
        return bookService.getAllSearch();
    }
    @GetMapping(value = "/type")
    public List<TypeOfBook> findAllType() {
        return typeOfBookService.getAll();
    }
}
