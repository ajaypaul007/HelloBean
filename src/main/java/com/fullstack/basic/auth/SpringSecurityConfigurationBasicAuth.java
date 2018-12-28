package com.fullstack.basic.auth;
/* 6:18 PM 
created by: ajaypalsingh , 2018-12-24
Project: HelloBean 
*/


import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//@Configuration
//@EnableWebSecurity
public class SpringSecurityConfigurationBasicAuth extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {


                http
                        .csrf().disable()
                        .authorizeRequests()
                        .antMatchers(HttpMethod.GET, "/**").permitAll()
                        .antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
                        .antMatchers(HttpMethod.PUT, "/**").permitAll()
                        .antMatchers(HttpMethod.DELETE, "/**").permitAll()
                        .anyRequest()
                .authenticated()
                .and()
               // .formLogin()
               // .and()
                .httpBasic();
    }
}
