package com.codegym.ss7_c0222g1.service;

import com.codegym.ss7_c0222g1.model.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();

    void updateUp(Integer id);

    String updateDown(Integer id);

    Book findById(Integer id);
}
