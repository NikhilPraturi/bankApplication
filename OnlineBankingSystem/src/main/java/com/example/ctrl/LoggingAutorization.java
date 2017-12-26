package com.example.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.access.AccessDeniedHandler;

public class LoggingAutorization  implements AccessDeniedHandler{


	private static Logger log=LoggerFactory.getLogger(LoggingAutorization.class);
	@Override
	public void handle(HttpServletRequest arg0, HttpServletResponse arg1, AccessDeniedException arg2)
			throws IOException, ServletException {

		Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
		if(authentication!=null)
		{
			log.info(authentication.getName()+" was trying to access protected resource: "+arg0.getRequestURL());
			
		}
		arg1.sendRedirect(arg0.getContextPath()+"/access denied");
		
	}

}
