package com.fullstack.jwt.resources;

import java.io.Serializable;
/* 11:52 AM 
created by: ajaypalsingh , 2018-12-27
Project: HelloBean 
*/


public class  JwtTokenRequest implements Serializable {

  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;

//    {
//        "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTU0NjU0MDExMywiaWF0IjoxNTQ1OTM1MzEzfQ.wMmx0hffiRERFoXJzzBmqUgaTOIo_Z4IUoz3MQ7jmbh_h9h71d-NpNZtlEus2A5g8Qg3kqPu2Uks6PUF1ILAyw"
//    }

    //eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyMSIsImV4cCI6MTU0NjU0MjQ2OCwiaWF0IjoxNTQ1OTM3NjY4fQ.rQrIDJj5LiMHQQhwRIZZUt2hddpUjczY4xdfn2Wrvbd821mafSFAnHG_gGNKJxS0wPO9Hm0PiCYsxMzkO8N2mw
    public JwtTokenRequest() {


    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
