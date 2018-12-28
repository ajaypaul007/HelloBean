package com.fullstack.basic.auth;
/* 8:28 PM 
created by: ajaypalsingh , 2018-12-24
Project: HelloBean 
*/


public class AuthenticationBean {

    private String message;


    public AuthenticationBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("HelloBean [message=%s]", message);
    }
}
