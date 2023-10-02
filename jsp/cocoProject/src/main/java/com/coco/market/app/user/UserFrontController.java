package com.coco.market.app.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coco.market.app.Result;


public class UserFrontController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(req, resp);
	}
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String target = req.getRequestURI().substring(req.getContextPath().length());//사용자가 요청한 경로 전체
		System.out.println(target);
		
		Result result = null;
		
		if(target.equals("/signUp.usr")) {
			result = new Result();
			result.setPath("/app/user/signUp.jsp");
		}else if(target.equals("/signUpOk.usr")) {
			result = new SignUpOkController().execute(req, resp);
		}
		else if(target.equals("/checkEmail.usr")) {
			result = new EmailCheckController().execute(req, resp);
		}else if(target.equals("/signInOk.usr")) {
			result = new SignInOkController().execute(req, resp);
		}else if(target.equals("/signIn.usr")) {
			result = new SignInController().execute(req, resp);
		}
		
		
		
		if (result != null) {
			if(result.isRedirect()) {
				resp.sendRedirect(result.getPath());
				
			}else {
				req.getRequestDispatcher(result.getPath()).forward(req, resp);

			}
		}
	}
	
	
}
