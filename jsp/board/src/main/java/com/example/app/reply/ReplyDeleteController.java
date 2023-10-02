package com.example.app.reply;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.Result;
import com.example.app.reply.dao.ReplyDAO;

public class ReplyDeleteController implements Execute {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException {
		// TODO Auto-generated method stub
		int replyNumber = Integer.valueOf(req.getParameter ("replyNumber"));
		new ReplyDAO().delete(replyNumber);
		return null;
	}

}
