package com.codegym.ss7_c0222g1.service;

import com.codegym.ss7_c0222g1.model.OderBook;
import com.codegym.ss7_c0222g1.repository.IOderBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OderBookService implements IOderBookService {
    @Autowired
    private IOderBookRepository iOderBookRepository;

    @Override
    public List<OderBook> findAll() {
        return iOderBookRepository.findAllOderBook();
    }

    @Override
    public void setStatus(Integer id, Integer idBorrow) {
        iOderBookRepository.setStatus(id,idBorrow);
    }
}
