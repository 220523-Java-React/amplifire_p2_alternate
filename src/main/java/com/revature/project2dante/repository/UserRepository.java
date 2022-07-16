package com.revature.project2dante.repository;

import com.revature.project2dante.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Long deleteByUserId(Integer userId);
    //findAll


}
