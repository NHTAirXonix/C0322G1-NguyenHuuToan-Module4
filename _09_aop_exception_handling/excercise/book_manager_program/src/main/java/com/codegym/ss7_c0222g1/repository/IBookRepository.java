package com.codegym.ss7_c0222g1.repository;

import com.codegym.ss7_c0222g1.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface IBookRepository extends JpaRepository<Book,Integer> {
    @Query(value = "select * from book" ,nativeQuery = true)
    Page<Book> findAll(Pageable pageable);

    @Modifying
    @Query(value = "update book set book_amount = :amount where book_id = :id " ,nativeQuery = true)
    void borrow(@Param("amount") Integer amount, @Param("id")Integer id);

    @Modifying
    @Query(value = "update book set book_amount = :amount where book_id = :id " ,nativeQuery = true)
    void returns(@Param("amount") Integer amount, @Param("id")Integer id);
}
