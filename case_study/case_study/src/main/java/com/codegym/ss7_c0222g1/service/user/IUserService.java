package com.codegym.ss7_c0222g1.service.user;

import com.codegym.ss7_c0222g1.model.login.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();

    void create (User user);
}
