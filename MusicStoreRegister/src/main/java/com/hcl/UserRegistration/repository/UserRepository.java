package com.hcl.UserRegistration.repository;

import com.hcl.UserRegistration.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Capstone Project

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
