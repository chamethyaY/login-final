package com.example.loginsecurity.Service;

import com.example.loginsecurity.model.User;
import com.example.loginsecurity.web.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto registrationDto);
}
