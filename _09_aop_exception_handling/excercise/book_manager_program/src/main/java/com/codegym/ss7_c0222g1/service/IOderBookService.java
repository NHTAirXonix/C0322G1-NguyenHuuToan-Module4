package com.codegym.ss7_c0222g1.service;

import com.codegym.ss7_c0222g1.model.Book;
import com.codegym.ss7_c0222g1.model.OderBook;

import java.util.List;

public interface IOderBookService {
    List<OderBook> findAll();

    void setStatus (Integer id, Integer idBorrow);
}
