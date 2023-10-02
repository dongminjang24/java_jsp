package com.coco.market.app.item;

import java.io.FileInputStream;
import java.io.IOException;
import java.rmi.ServerException;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coco.market.app.Execute;
import com.coco.market.app.Result;
import com.coco.market.app.file.dao.FileDAO;
import com.coco.market.app.file.vo.FileVO;
import com.coco.market.app.item.dao.ItemDAO;
import com.coco.market.app.item.vo.ItemVO;


public class ItemDetailController implements Execute {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException {

		Result result = new Result();
		System.out.println("여기까지 오니?");
		String itemNumberStr = req.getParameter("itemNumber");
		System.out.println(itemNumberStr);
		long itemNumber = Long.valueOf(itemNumberStr);  
		ItemDAO itemDAO = new ItemDAO();
		ItemVO itemVO = itemDAO.select(itemNumber);
		FileDAO fileDAO = new FileDAO();
		List<FileVO> fileList = fileDAO.select(itemNumber);
        req.setAttribute("itemImages", fileList); 
		req.setAttribute("item", itemVO);
		
		result.setPath("/app/item/detail.jsp");
		return result;		
	}

}
