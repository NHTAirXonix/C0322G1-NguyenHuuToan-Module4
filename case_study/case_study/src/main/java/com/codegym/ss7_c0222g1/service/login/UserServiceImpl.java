package com.codegym.ss7_c0222g1.service.login;

import com.codegym.ss7_c0222g1.model.login.AppUser;
import com.codegym.ss7_c0222g1.repository.login.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public AppUser findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void create(AppUser appUser) {
        userRepository.save(appUser);
    }
}
