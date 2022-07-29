package com.codegym.ss7_c0222g1.repository;


import com.codegym.ss7_c0222g1.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface IBlogRepository extends JpaRepository<Blog, Integer> {

    @Query(value = "select * from blog", nativeQuery = true)
    Page<Blog> findAllBlogInDatabase(Pageable pageable);

    @Query(value = "select * from blog where blog_title like %:title%", nativeQuery = true)
    Page<Blog> findByTitleOfBlog(@Param("title") String title, Pageable pageable);

    @Query(value = "select * from blog where blog_title like :title", nativeQuery = true)
    List<Blog> findByTitleBlog(@Param("title") String title);

    @Query(value = "select * from blog where blog_id = :id", nativeQuery = true)
    Blog findBlogWithId(@Param("id") Integer id);

    @Query(value = "select * from blog where id_category = :id", nativeQuery = true)
    Page<Blog> findBlogWithIdCategory(@Param("id") Integer id, Pageable pageable);

    @Modifying
    @Query(value = "insert into blog (create_day,blog_category,blog_title,blog_content) value (:day,:category,:title, :content)", nativeQuery = true)
    void save(@Param("day") String day,
              @Param("category") Integer category,
              @Param("title") String title,
              @Param("content") String content);


    @Modifying
    @Query(value = "update blog set  blog_category = :category,create_day = :day, blog_content = :content, blog_title = :title where blog_id = :id", nativeQuery = true)
    void update(@Param("day") String day,
                @Param("category") Integer category,
                @Param("title") String title,
                @Param("content") String content,
                @Param("id") Integer id);

    @Modifying
    @Query(value = "delete from blog where blog_id = :id", nativeQuery = true)
    void delete(@Param("id") Integer id);


}
