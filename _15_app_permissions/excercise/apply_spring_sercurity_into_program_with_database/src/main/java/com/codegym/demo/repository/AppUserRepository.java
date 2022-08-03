package com.codegym.demo.repository;

import com.codegym.demo.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    AppUser findByUserName(String username);
}
