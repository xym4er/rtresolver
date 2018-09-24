package com.drweb.rtresolver.repos;

import com.drweb.rtresolver.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
