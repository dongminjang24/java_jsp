package com.coco.market.app.user;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coco.market.app.Execute;
import com.coco.market.app.Result;

public class SignInController implements Execute {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException {
		Result result = new Result();
	
		String cookieCheck = req.getHeader("Cookie");
			if(cookieCheck != null) {
				Cookie[] cookies = req.getCookies();
				for(Cookie cookie : cookies) {
					if(cookie.getName().equals("userEmail")) {
						req.setAttribute("userEmail", cookie.getValue());
					}
//					if(cookie.getName().equals("saveEmail")) {
//						req.setAttribute("saveEmail", cookie.getValue());
//					}
				}
				
			}
		result.setPath("/app/user/signIn.jsp");
		return result;
	}

}
