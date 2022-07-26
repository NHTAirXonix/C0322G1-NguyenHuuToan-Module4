package com.codegym.ss7_c0222g1.service;

import com.codegym.ss7_c0222g1.model.User;
import com.codegym.ss7_c0222g1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addNew(User user) {
        userRepository.save(user);
    }

    @Override
    public User findByCode(String code) {
        return userRepository.findByCode(code);
    }

    @Override
    public void delete(String code) {
        userRepository.deleteByCode(code);
    }
}
