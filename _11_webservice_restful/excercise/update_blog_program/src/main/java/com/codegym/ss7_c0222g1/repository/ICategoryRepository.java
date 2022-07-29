package com.codegym.ss7_c0222g1.repository;

import com.codegym.ss7_c0222g1.model.Blog;
import com.codegym.ss7_c0222g1.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface ICategoryRepository extends JpaRepository<Category,Integer> {

    @Query(value = "select id from category where name = :name", nativeQuery = true)
    Integer findByName(@Param("name") String name);
}
