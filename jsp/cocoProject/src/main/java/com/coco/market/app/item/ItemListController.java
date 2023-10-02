package com.coco.market.app.item;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coco.market.app.Execute;
import com.coco.market.app.Result;
import com.coco.market.app.item.dao.ItemDAO;

public class ItemListController implements Execute {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException {
		System.out.println("0단");
		ItemDAO itemDAO = new ItemDAO();
		System.out.println("1단");
		Result result = new Result();
		System.out.println("2단");

		req.setAttribute("items", itemDAO.selectAll());
		System.out.println("3단");
		result.setPath("/app/item/list.jsp");
		return result;
	}

}
