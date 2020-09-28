package com.bezkoder.springjwt.services;

import com.bezkoder.springjwt.models.Book;

import java.util.List;

public interface BookService {
    List<Book> getAll();
    List<Book> getAllSearch();
}
