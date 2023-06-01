package com.project.EmployeeApplication.authentication;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HardCodedAuthenticationService {

    private static List<User> users = new ArrayList<>();
    private static int userId = 0;

    {
        users.add(new User(++userId, "kohhx", "password"));
        users.add(new User(++userId, "leon", "password"));
    }

    public boolean authenticate(String username, String password) {
        Optional<User> userFound = users.stream()
                .filter(user -> user.getUsername().equals(username) && user.getPassword().equals(password))
                .findFirst();
        return userFound.isPresent();
    }


}
