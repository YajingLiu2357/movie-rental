package com.ecommerce.movierental.repository;

import com.ecommerce.movierental.model.AuthenticationToken;
import com.ecommerce.movierental.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepo extends JpaRepository<AuthenticationToken, Integer> {
    AuthenticationToken findByUser(User user);
}
