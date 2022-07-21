package com.codegym.ss7_c0222g1.service;

import com.codegym.ss7_c0222g1.model.Category;
import com.codegym.ss7_c0222g1.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;

    @Override
    public void save(Category category) {
        iCategoryRepository.save(category);
    }

    @Override
    public Optional<Category> findById(Integer id) {
        return iCategoryRepository.findById(id);
    }

    @Override
    public void update(Category category) {
        iCategoryRepository.update(category.getId(), category.getName());
    }

    @Override
    public void delete(Category category) {
        iCategoryRepository.delete(category);
    }

    @Override
    public List<Category> findAll() {
        return iCategoryRepository.findAll();
    }
}
