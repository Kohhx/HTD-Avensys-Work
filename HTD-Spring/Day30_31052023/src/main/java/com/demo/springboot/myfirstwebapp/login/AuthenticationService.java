package com.demo.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password) {
        boolean isValidUserName = username.equalsIgnoreCase("kohhx");
        boolean isValidPassword = password.equalsIgnoreCase("password");
        return isValidUserName && isValidPassword;
    }
}
