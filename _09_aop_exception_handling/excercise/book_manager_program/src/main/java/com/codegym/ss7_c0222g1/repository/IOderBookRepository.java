package com.codegym.ss7_c0222g1.repository;

import com.codegym.ss7_c0222g1.model.Book;
import com.codegym.ss7_c0222g1.model.OderBook;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface IOderBookRepository extends JpaRepository<OderBook,Integer> {


    @Query(value = "select * from orderbook where status = ''" ,nativeQuery = true)
    List<OderBook> findAllOderBook();

    @Modifying
    @Query(value = "update orderbook set book_status = '1' where book_id = :id and oder_book_id = :idBorrow" ,nativeQuery = true)
    void setStatus(@Param("id") Integer id, @Param("idBorrow")Integer idBorrow);
}
