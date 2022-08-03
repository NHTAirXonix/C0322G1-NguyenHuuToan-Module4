package vn.codegym.spring_security_database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.spring_security_database.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
