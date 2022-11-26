package com.ecommerce.movierental.service;

import com.ecommerce.movierental.dto.ResponseDto;
import com.ecommerce.movierental.dto.user.SignInDto;
import com.ecommerce.movierental.dto.user.SignInResponseDto;
import com.ecommerce.movierental.dto.user.SignupDto;
import com.ecommerce.movierental.exceptions.AuthenticationFailException;
import com.ecommerce.movierental.exceptions.CustomException;
import com.ecommerce.movierental.model.AuthenticationToken;
import com.ecommerce.movierental.model.User;
import com.ecommerce.movierental.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    @Autowired
    AuthenticationService authenticationService;

    @Transactional
    public ResponseDto signUp(SignupDto signupDto) {
        if (Objects.nonNull(userRepo.findByEmail(signupDto.getEmail()))){
            throw new CustomException("user already present");
        }
        String encryptedPassword = signupDto.getPassword();
        try {
            encryptedPassword = hashPassword(signupDto.getPassword());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        User user = new User(signupDto.getFirstName(), signupDto.getLastName(), signupDto.getEmail(), encryptedPassword);
        userRepo.save(user);

        final AuthenticationToken authenticationToken = new AuthenticationToken(user);
        authenticationService.saveConfirmationToken(authenticationToken);

        ResponseDto responseDto = new ResponseDto("success", "user created successfully");
        return responseDto;
    }

    private String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        String hash = DatatypeConverter.printHexBinary(digest).toUpperCase();
        return hash;

    }

    public SignInResponseDto signIn(SignInDto signInDto) {
        User user = userRepo.findByEmail(signInDto.getEmail());
        if (Objects.isNull(user)){
            throw new AuthenticationFailException("user is not valid");
        }
        try{
            if (!user.getPassword().equals(hashPassword(signInDto.getPassword()))){
                throw new AuthenticationFailException("wrong password");
            }
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        AuthenticationToken token = authenticationService.getToken(user);

        if (Objects.isNull(token)){
            throw new CustomException("token is not present");
        }
        return new SignInResponseDto("success", token.getToken());
    }
}
