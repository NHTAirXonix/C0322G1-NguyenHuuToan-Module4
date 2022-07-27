package com.codegym.ss7_c0222g1.repository.user;

import com.codegym.ss7_c0222g1.model.login.User;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface UserRepository extends JpaRepository<User,String> {
}
