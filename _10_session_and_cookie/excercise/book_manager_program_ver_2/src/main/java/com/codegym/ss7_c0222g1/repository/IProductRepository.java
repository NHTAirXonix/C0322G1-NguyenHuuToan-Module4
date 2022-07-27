package com.codegym.ss7_c0222g1.repository;


import com.codegym.ss7_c0222g1.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product, Integer> {
}