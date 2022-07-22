package com.codegym.ss7_c0222g1.service;

import com.codegym.ss7_c0222g1.model.Blog;
import com.codegym.ss7_c0222g1.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return iBlogRepository.findAllBlogInDatabase(pageable);
    }

    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog.getCreateDay(), blog.getCategory().getId(), blog.getTitle(), blog.getContent());
    }

    @Override
    public void update(Blog blog) {
        iBlogRepository.update(blog.getCreateDay(), blog.getCategory().getId(), blog.getTitle(), blog.getContent(), blog.getIdBlog());
    }

    @Override
    public Blog findById(Integer id) {
        return iBlogRepository.findBlogWithId(id);
    }


    @Override
    public void remove(int id) {
        iBlogRepository.delete(id);
    }

    @Override
    public Page<Blog> findByTitleOfBlog(String title, String id, Pageable pageable) {
        return iBlogRepository.findByTitleOfBlog(title, id,pageable);
    }

    @Override
    public void deleteByCategory(Integer id) {
        iBlogRepository.deleteByCategory(id);
    }

    @Override
    public Page<Blog> findAllByCategoryId(Integer id, Pageable pageable) {
        return iBlogRepository.findALlByCategoryId(id, pageable);
    }
}
