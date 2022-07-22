package com.codegym.ss7_c0222g1.repository;

import com.codegym.ss7_c0222g1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface IRegister extends JpaRepository<User, Integer> {

    @Modifying
    @Query(value = "insert into user (user_age,user_email,first_name,last_name,user_phone) value (:age,:email,:firstName, :lastName,:phone)", nativeQuery = true)
    void save(@Param("age") String age,
              @Param("email") String email,
              @Param("firstName") String firstName,
              @Param("lastName") String lastName,
              @Param("phone") String phone);

    @Query(value = "select * from user", nativeQuery = true)
    List<User> findAll();
}
