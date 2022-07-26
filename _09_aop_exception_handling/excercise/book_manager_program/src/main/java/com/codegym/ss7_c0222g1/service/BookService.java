package com.codegym.ss7_c0222g1.service;

import com.codegym.ss7_c0222g1.model.Book;
import com.codegym.ss7_c0222g1.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService implements IBookService{
    @Autowired
    private IBookRepository bookRepository;

    @Override
    public Page<Book> findAll(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Optional<Book> findById(Integer id) {
        return bookRepository.findById(id);
    }

    @Override
    public void borrow(Book book) {
        bookRepository.borrow((book.getAmount()-1), book.getId());
    }

    @Override
    public void returns(Book book) {
        bookRepository.returns((book.getAmount()+1), book.getId());
    }
}
