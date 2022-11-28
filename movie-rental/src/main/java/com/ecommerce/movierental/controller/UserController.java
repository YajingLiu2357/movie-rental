package com.ecommerce.movierental.controller;

import com.ecommerce.movierental.dto.ResponseDto;
import com.ecommerce.movierental.dto.user.SignInDto;
import com.ecommerce.movierental.dto.user.SignInResponseDto;
import com.ecommerce.movierental.dto.user.SignupDto;
import com.ecommerce.movierental.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/signUp")
    public ResponseDto signup(@RequestBody SignupDto signupDto){
        return userService.signUp(signupDto);
    }
    @PostMapping("/signIn")
    public SignInResponseDto signin(@RequestBody SignInDto signInDto){
        return userService.signIn(signInDto);
    }
}
