package com.example.springbootweek7.Repository;

import com.example.springbootweek7.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long>{
    Optional<Users> findByEmailAndPassword(String email, String password);
}
