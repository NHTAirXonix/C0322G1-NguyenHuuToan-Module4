package com.codegym.ss7_c0222g1.repository;

import com.codegym.ss7_c0222g1.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface IProductRepository extends JpaRepository<Product,Integer> {

    @Query(value = "select * from product where product_status = '' ",nativeQuery = true)
    Page<Product> findAll(Pageable pageable);

    @Modifying
    @Query(value = "update  product set product_status = '1' where product_id = :id",nativeQuery = true)
    void deleteById(@Param("id") String id);


    @Query(value = "select * from product where product_name  like %:name% ",nativeQuery = true)
    Page<Product> searchByName(@Param("name") String name, Pageable pageable);
}
