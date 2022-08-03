package com.codegym.ss7_c0222g1.service.login;


import com.codegym.ss7_c0222g1.model.login.AppUser;

public interface UserService {
    AppUser findByUsername(String username);

    void create(AppUser appUser);
}
