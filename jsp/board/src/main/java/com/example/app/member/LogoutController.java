package com.example.app.member;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.Result;

public class LogoutController implements Execute{

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException {
//		req.getSession().removeAttribute("memberNumber");//키값으로 제거하기 ,보통 실무에서는 쓰지 않음, 깜빡하고 안지울까봐 다른 것들
		Result result = new Result();
		req.getSession().invalidate();// 무조건 request에 세션담기 invalidate는 세션에 있는 것 싹다 제거
		
		result.setPath("/member/login.me");
		return result;
	}
	

}
