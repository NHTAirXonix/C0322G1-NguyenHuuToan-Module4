package com.codegym.ss7_c0222g1.service;


import com.codegym.ss7_c0222g1.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;
import java.util.Optional;

public interface IProductService {

    Page<Product> findAllByName(String name, Pageable pageable);

    void save(Product product);

    Optional<Product> findById(Integer id);

    void deleteById(String id);

    List<Product> searchByName(Product product);
}
