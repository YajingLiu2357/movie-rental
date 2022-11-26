package com.ecommerce.movierental.repository;

import com.ecommerce.movierental.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}

