package com.example.app.reply;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import com.example.app.Execute;
import com.example.app.Result;
import com.example.app.reply.dao.ReplyDAO;

public class ReplyListController implements Execute {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException {
		//뭘해도 깨진다면, resp.setContentType("application/json; charset=utf-8");
		resp.setCharacterEncoding("UTF-8");
		
		int boardNumber = Integer.valueOf(req.getParameter("boardNumber"));
		PrintWriter out = resp.getWriter();
		
		ReplyDAO replyDAO = new ReplyDAO();
		
		JSONArray replies = new JSONArray();
		
		replyDAO.selectAll(boardNumber).stream().map(reply-> new JSONObject(reply)).forEach(obj->replies.put(obj));
		
		
		out.print(replies.toString());
		out.close();
	
		return null;
	}

}
