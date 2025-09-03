package com.example.loginsecurity.repository;

import com.example.loginsecurity.model.Role;
import com.example.loginsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository  extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);

}
