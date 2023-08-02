package com.example.springbootweek7.Services;

import com.example.springbootweek7.Models.Users;
import com.example.springbootweek7.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Users signUp(String firstName, String lastName, String email, String password){
        if (firstName == null || lastName == null || email == null || password == null) {
            return null;
        } else {
            Users users = new Users();
            users.setFirstName(firstName);
            users.setLastName(lastName);
            users.setEmail(email);
            users.setPassword(password);
            return userRepository.save(users);
        }
    }
    public Users logIn(String email, String password){
        return userRepository.findByEmailAndPassword(email, password).orElse(null);
    }
}
