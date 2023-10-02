package com.coco.market.app.item;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coco.market.app.Execute;
import com.coco.market.app.Result;
import com.coco.market.app.item.dao.ItemDAO;
import com.coco.market.app.user.dao.UserDAO;

public class ItemWriteController implements Execute {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException {
		int userNumber = 0;
		Result result = new Result();
		UserDAO userDAO = new UserDAO();
		ItemDAO itemDAO = new ItemDAO();

		try {
			userNumber =(Integer)req.getSession().getAttribute("userNumber");
			req.setAttribute("userEmail", userDAO.getUserEmail(userNumber));
			req.setAttribute("bigCategory", itemDAO.selectAllCat());
			result.setPath("/app/item/plus.jsp");
		} catch (Exception e) {
			result.setPath("/app/user/signIn.jsp");
			e.printStackTrace();

		}
		
		return result;
	}

}
