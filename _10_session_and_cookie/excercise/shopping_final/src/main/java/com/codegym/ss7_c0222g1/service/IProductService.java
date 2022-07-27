package com.codegym.ss7_c0222g1.service;


import com.codegym.ss7_c0222g1.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();

    Optional<Product> findById(Integer id);
}