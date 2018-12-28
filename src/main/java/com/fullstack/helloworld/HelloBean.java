package com.fullstack.helloworld;
/* 4:43 PM 
created by: ajaypalsingh , 2018-11-23
Project: HelloBean 
*/


public class HelloBean {

    private String message;


    public HelloBean(String message) {
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