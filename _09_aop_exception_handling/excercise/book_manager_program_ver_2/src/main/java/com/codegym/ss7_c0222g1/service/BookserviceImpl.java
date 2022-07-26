package com.codegym.ss7_c0222g1.service;

import com.codegym.ss7_c0222g1.model.Book;
import com.codegym.ss7_c0222g1.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookserviceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public void updateUp(Integer id) {
        bookRepository.updateUp(id);
    }

    @Override
    public String updateDown(Integer id) {
        if (bookRepository.findById(id).get().getQuantity() == 0) {
            return "error";
        }
        bookRepository.updateDown(id);
        return null;
    }

    @Override
    public Book findById(Integer id) {
        return bookRepository.findById(id).get();
    }
}
