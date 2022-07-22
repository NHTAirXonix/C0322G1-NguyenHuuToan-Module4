package com.codegym.ss7_c0222g1.service;

import com.codegym.ss7_c0222g1.model.User;
import com.codegym.ss7_c0222g1.repository.IRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterService implements IRegisterService{
    @Autowired
    private IRegister iRegister;

    @Override
    public void save(User user) {
        iRegister.save(user.getAge(),user.getEmail(),user.getFirstName(),user.getLastName(),user.getPhone());
    }

    @Override
    public List<User> findAll() {
        return iRegister.findAll();
    }
}
