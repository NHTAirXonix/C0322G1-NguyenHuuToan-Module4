package com.codegym.ss7_c0222g1.service;

import com.codegym.ss7_c0222g1.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.persistence.criteria.CriteriaBuilder;

public interface IBlogService {

    Page<Blog> findAll(Pageable pageable);

    void save(Blog blog);

    void update(Blog blog);

    Blog findById(Integer id);

    void remove(int id);

    Page<Blog> findByTitleOfBlog(String title, String id, Pageable pageable);

    void deleteByCategory(Integer id);

    Page<Blog> findAllByCategoryId(Integer id, Pageable pageable);
}
