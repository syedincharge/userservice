package com.rizvi.spring.repository;

import com.rizvi.spring.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String username);



}
