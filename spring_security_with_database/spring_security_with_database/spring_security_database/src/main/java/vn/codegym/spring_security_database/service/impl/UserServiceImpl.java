package vn.codegym.spring_security_database.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.spring_security_database.model.User;
import vn.codegym.spring_security_database.repository.UserRepository;
import vn.codegym.spring_security_database.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
