package com.codegym.ss7_c0222g1.service;

import com.codegym.ss7_c0222g1.model.Category;
import com.codegym.ss7_c0222g1.repository.IBlogRepository;
import com.codegym.ss7_c0222g1.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;

    @Override
    public List<Category> findAll() {
        return iCategoryRepository.findAll();
    }

    @Override
    public Integer getId(String name) {
        return iCategoryRepository.findByName(name);
    }

}
