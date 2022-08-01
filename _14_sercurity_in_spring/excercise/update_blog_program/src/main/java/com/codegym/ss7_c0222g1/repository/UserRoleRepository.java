package com.codegym.ss7_c0222g1.repository;


import com.codegym.ss7_c0222g1.model.AppUser;
import com.codegym.ss7_c0222g1.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

    List<UserRole> findByAppUser(AppUser appUser);

    //Nếu sử dụng  manytomany thì cần phải thay dổi repository này thành ROLE và
    //sử dụng @Query để có thể lấu list<Role> dựa vào AppUser (người đang đăng nhập)
}
