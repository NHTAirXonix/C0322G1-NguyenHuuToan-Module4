package com.codegym.ss7_c0222g1.service;

import com.codegym.ss7_c0222g1.model.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    void save(Category category);

    Optional<Category> findById(Integer id);

    void update(Category category);

    void delete(Category category);

    List<Category> findAll();
}
