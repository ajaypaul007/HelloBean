package com.fullstack;
/* 1:58 PM 
created by: ajaypalsingh , 2018-12-27
Project: HelloBean 
*/


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptEncoderTest {

    public static void main(String[] args) {

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        for(int i=1; i<10; i++) {

            String encodedString = encoder.encode("ap");
            System.out.println(encodedString);
        }


    }
}
