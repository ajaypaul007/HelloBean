package com.fullstack.jwt.resources;
/* 11:52 AM 
created by: ajaypalsingh , 2018-12-27
Project: HelloBean 
*/


public class AuthenticationException extends RuntimeException {
    public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }
}
