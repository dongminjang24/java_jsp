package com.coco.market.app.user;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.coco.market.app.Execute;
import com.coco.market.app.Result;
import com.coco.market.app.user.dao.UserDAO;
import com.coco.market.app.user.vo.UserVO;

public class SignInOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException {
		
		String userEmail = req.getParameter("userEmail");
		String userPassword = req.getParameter("userPassword");
		
		int userNumber =0;
		UserDAO userDAO =  new UserDAO();
		Result result = new Result();
		HttpSession session = req.getSession();
		
		
		try {
			System.out.println("1단");

			userNumber = userDAO.signIn(userEmail, userPassword);
			System.out.println("2단");

			session.setAttribute("userNumber", userNumber);
			//로그인 성공
			System.out.println("3단");

			String cookieCheck = req.getHeader("Cookie");
			System.out.println("4단");

			Cookie[] cookies = req.getCookies();

			for(Cookie cookie : cookies) {
				if ( cookie.getName().equals("userEmail")) {
					cookie.setMaxAge(0);
					resp.addCookie(cookie);
					System.out.println("5단");

				}
				
			}
			
			result.setPath("item/list.it");
		} catch (Exception e) {
			
//			e.printStackTrace();
			System.out.println("asdf");
		}
		
		return result;
	}

}
