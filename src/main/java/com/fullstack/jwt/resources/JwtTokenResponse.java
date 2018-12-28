package com.fullstack.jwt.resources;

import java.io.Serializable;
/* 11:52 AM 
created by: ajaypalsingh , 2018-12-27
Project: HelloBean 
*/


public class JwtTokenResponse implements Serializable {

  private static final long serialVersionUID = 8317676219297719109L;

  private final String token;

    public JwtTokenResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}
