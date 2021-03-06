package com.fullstack.jwt.auth;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class JwtInMemoryUserDetailsService implements UserDetailsService {

  //$2a$10$wg3avi2Hcvu48igsfS8g3eG6/4bqf7ciFvrjFnpWxUYme.JODXIi2

  static List<JwtUserDetails> inMemoryUserList = new ArrayList<>();

  static {
    inMemoryUserList.add(new JwtUserDetails(1L, "in28minutes",
        "$2a$10$3zHzb.Npv1hfZbLEU5qsdOju/tk2je6W6PnNnY.c1ujWPcZh4PL6e", "ROLE_USER_2"));
    inMemoryUserList.add(new JwtUserDetails(2L, "user1",
            "$2a$10$wg3avi2Hcvu48igsfS8g3eG6/4bqf7ciFvrjFnpWxUYme.JODXIi2", "ROLE_USER_2"));

    //eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhcCIsImV4cCI6MTU0NjU0MzMyNCwiaWF0IjoxNTQ1OTM4NTI0fQ.4Ra-3CqKXXbGGr-uY_fgmV5Eb1HpRiqZSsz8OPX_dyo1G53MfOeOqQvQSeXDqi2IytfU4roA-mQ-gMxv2Dp9Ag
    inMemoryUserList.add(new JwtUserDetails(3L, "ap",
            "$2a$10$CqShMAKoKzLr/fJjvtMSVOwq.PnUy2a2Z1wSc.ZwJPSIezF3PUCyC", "ROLE_USER_2"));
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Optional<JwtUserDetails> findFirst = inMemoryUserList.stream()
        .filter(user -> user.getUsername().equals(username)).findFirst();

    if (!findFirst.isPresent()) {
      throw new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username));
    }

    return findFirst.get();
  }

}


