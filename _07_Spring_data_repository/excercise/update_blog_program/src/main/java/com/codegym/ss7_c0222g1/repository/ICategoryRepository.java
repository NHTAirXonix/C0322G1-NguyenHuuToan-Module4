package com.codegym.ss7_c0222g1.repository;

import com.codegym.ss7_c0222g1.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface ICategoryRepository extends JpaRepository<Category, Integer> {

    @Modifying
    @Query(value = "update category set name = :name where id = :id", nativeQuery = true)
    void update(@Param("id") Integer id, @Param("name") String name);
}
