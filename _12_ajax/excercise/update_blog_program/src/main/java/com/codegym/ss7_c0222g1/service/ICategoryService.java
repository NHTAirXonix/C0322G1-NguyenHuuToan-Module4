package com.codegym.ss7_c0222g1.service;

import com.codegym.ss7_c0222g1.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();

    Integer getId(String name);
}
