package com.coco.market.app.user;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coco.market.app.Execute;
import com.coco.market.app.Result;
import com.coco.market.app.user.dao.UserDAO;

public class EmailCheckController implements Execute {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException {
//		String memberId = req.getParameter("memberId");
//		MemberDAO memberDAO = new MemberDAO();
////		memberDAO.checkId(memberId);
//		resp.getWriter().print(memberDAO.checkId(memberId));
//		return null;
		
		String userEmail = req.getParameter("userEmail");
		UserDAO userDAO = new UserDAO();
		userDAO.checkEmail(userEmail);
		resp.getWriter().print(userDAO.checkEmail(userEmail));
		return null;
	}
	

}
