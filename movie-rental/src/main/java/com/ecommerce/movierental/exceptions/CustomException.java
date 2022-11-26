package com.ecommerce.movierental.exceptions;

public class CustomException extends IllegalArgumentException{
    public CustomException(String msg){
        super(msg);
    }
}
