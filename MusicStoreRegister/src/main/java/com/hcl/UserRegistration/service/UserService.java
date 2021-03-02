package com.hcl.UserRegistration.service;

import com.hcl.UserRegistration.model.User;
import com.hcl.UserRegistration.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

//Capstone Project

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
    User findByEmail(String email);
}
