package com.codegym.ss7_c0222g1.service;

import com.codegym.ss7_c0222g1.model.User;

import java.util.List;

public interface IRegisterService {
    void save(User user);
    List<User> findAll();
}
