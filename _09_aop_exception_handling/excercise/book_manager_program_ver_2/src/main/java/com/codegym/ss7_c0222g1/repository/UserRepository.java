package com.codegym.ss7_c0222g1.repository;


import com.codegym.ss7_c0222g1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserRepository extends JpaRepository<com.codegym.ss7_c0222g1.model.User, Integer> {

    void deleteByCode(String code);

    User findByCode(String code);
}