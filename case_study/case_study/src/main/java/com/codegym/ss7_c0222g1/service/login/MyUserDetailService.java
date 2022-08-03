package com.codegym.ss7_c0222g1.service.login;

import com.codegym.ss7_c0222g1.model.login.AppUser;
import com.codegym.ss7_c0222g1.model.login.MyUserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser appUser = userService.findByUsername(username);

        if (appUser == null) {
            throw new UsernameNotFoundException(username + " not found!");
        }

        return new MyUserDetail(appUser);
    }
}
