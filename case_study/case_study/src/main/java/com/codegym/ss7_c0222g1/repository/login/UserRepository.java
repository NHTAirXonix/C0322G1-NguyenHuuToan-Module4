package com.codegym.ss7_c0222g1.repository.login;

import com.codegym.ss7_c0222g1.model.login.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<AppUser, Integer> {
    AppUser findByUsername(String username);
}
