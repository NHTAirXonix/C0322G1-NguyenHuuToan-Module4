package main.repository;

import main.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface IBlogRepository extends JpaRepository<Blog, Integer> {

    @Query(value = "select * from blog where status = 0", nativeQuery = true)
    List<Blog> findAllBlogInDatabase();

    @Query(value = "select * from blog where blog_id = :id", nativeQuery = true)
    Blog findBlogWithId(@Param("id") Integer id);

    @Modifying
    @Query(value = "insert into blog (blog_title,blog_content,writing_day,status) value (:title, :content, :day, :status)", nativeQuery = true)
    void save(@Param("title") String title, @Param("content") String content, @Param("day") String day, @Param("status") Integer status);


    @Modifying
    @Query(value = "update blog set blog_content = :content, blog_title = :title, writing_day =:day, status =:status where blog_id = :id", nativeQuery = true)
    void update(@Param("title") String title, @Param("content") String content, @Param("id") Integer id, @Param("day") String day, @Param("status") Integer status);

    @Modifying
    @Query(value = "update blog set status = 1 where blog_id = :id", nativeQuery = true)
    void delete(@Param("id") Integer id);
}
