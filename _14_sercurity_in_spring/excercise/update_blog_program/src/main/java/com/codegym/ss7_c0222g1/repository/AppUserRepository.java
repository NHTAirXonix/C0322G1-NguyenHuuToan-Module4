package com.codegym.ss7_c0222g1.repository;


import com.codegym.ss7_c0222g1.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    AppUser findByUserName(String username);
}
