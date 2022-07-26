package com.codegym.ss7_c0222g1.service;

import com.codegym.ss7_c0222g1.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;


public interface IBookService {
    Page<Book> findAll(Pageable pageable);

    void save(Book book);

    Optional<Book> findById(Integer id);

    void borrow(Book book);

    void returns(Book book);
}
