package main.service;

import main.model.Blog;
import main.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public List<Blog> findAll() {
        return iBlogRepository.findAllBlogInDatabase();
    }

    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog.getTitle(), blog.getContent(), blog.getDay(), blog.getStatus());
    }

    @Override
    public void update(Blog blog) {
        iBlogRepository.update(blog.getTitle(), blog.getContent(), blog.getIdBlog(), blog.getDay(), blog.getStatus());
    }

    @Override
    public Blog findById(Integer id) {
        return iBlogRepository.findBlogWithId(id);
    }


    @Override
    public void remove(int id) {
        iBlogRepository.delete(id);
    }
}
