package main.service;

import main.model.Blog;

import java.util.List;

public interface IBlogService {

    List<Blog> findAll();

    void save(Blog blog);

    void update(Blog blog);

    Blog findById(Integer id);

    void remove(int id);
}
