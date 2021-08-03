package com.joker.admin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN,reason = "用户量太多")
public class UserTooManyException extends RuntimeException{

    public UserTooManyException(){

    }
    public UserTooManyException(String message){
        super(message);
    }
}
