package fr.forth_dev.login_register.repository;

import fr.forth_dev.login_register.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String username);
}
