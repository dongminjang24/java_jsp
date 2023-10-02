package com.coco.market.app.user;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coco.market.app.Execute;
import com.coco.market.app.Result;
import com.coco.market.app.user.dao.UserDAO;
import com.coco.market.app.user.vo.UserVO;


public class SignUpOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException {
		req.setCharacterEncoding("UTF-8");
		UserDAO userDAO = new UserDAO();
		UserVO userVO = new UserVO();
		
		Result result = new Result();
		
		userVO.setUserEmail(req.getParameter("userEmail"));
		userVO.setUserPassword(req.getParameter("userPassword"));
		userVO.setUserNickname(req.getParameter("userNickname"));
		userVO.setUserAddress(req.getParameter("userAddress"));
		userVO.setUserPhoneNumber(req.getParameter("userPhoneNumber"));

		userDAO.signUp(userVO);
		
		result.setRedirect(true);
		
		result.setPath(req.getContextPath()+ "/signIn.usr");
		return result;
	}

}
