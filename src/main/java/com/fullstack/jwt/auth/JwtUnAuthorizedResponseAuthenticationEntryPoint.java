package com.fullstack.jwt.auth;

import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;

/* 11:52 AM 
created by: ajaypalsingh , 2018-12-27
Project: HelloBean 
*/


@Component
public class JwtUnAuthorizedResponseAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {

  private static final long serialVersionUID = -8970718410437077606L;


  @Override
  public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                       org.springframework.security.core.AuthenticationException e) throws IOException, ServletException {

    httpServletResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED,
            "You would need to provide the Jwt Token to Access This resource");

  }

}
