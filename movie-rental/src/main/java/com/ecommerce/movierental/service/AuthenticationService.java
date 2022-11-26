package com.ecommerce.movierental.service;

import com.ecommerce.movierental.model.AuthenticationToken;
import com.ecommerce.movierental.model.User;
import com.ecommerce.movierental.repository.TokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    @Autowired
    TokenRepo tokenRepo;
    public void saveConfirmationToken(AuthenticationToken authenticationToken) {
        tokenRepo.save(authenticationToken);
    }

    public AuthenticationToken getToken(User user) {
        return tokenRepo.findByUser(user);
    }
}
