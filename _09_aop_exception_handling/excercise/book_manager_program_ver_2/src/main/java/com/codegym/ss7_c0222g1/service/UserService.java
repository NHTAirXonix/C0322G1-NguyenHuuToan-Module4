package com.codegym.ss7_c0222g1.service;

import com.codegym.ss7_c0222g1.model.User;

public interface UserService {
    void addNew(User user);

    User findByCode(String code);

    void delete(String code);
}
