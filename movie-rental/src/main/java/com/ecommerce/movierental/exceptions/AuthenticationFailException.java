package com.ecommerce.movierental.exceptions;

public class AuthenticationFailException extends IllegalArgumentException{
    public AuthenticationFailException(String msg){
        super(msg);
    }
}
