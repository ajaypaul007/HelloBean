package com.fullstack.basic.auth;
/* 4:40 PM 
created by: ajaypalsingh , 2018-11-23
Project: HelloBean 
*/

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BasicAuthenticationController {


//    @GetMapping("/hello-world")
//        public String helloWorld(){
//            return "Hello World";
//        }

    @GetMapping("/basicauth")
    public AuthenticationBean helloWorldbean(String message) {

        return new AuthenticationBean("You are authenticated");
        // throw new RuntimeException("Error Occured, Please contact Support at 1-800-xxx");


//        @GetMapping(path = "hello-world-name/{message}")
//    public HelloBean helloWorldname(@PathVariable String message) {
//
//        return new HelloBean(String.format("Hello World, %s", message));
//
//        }
    }
}
