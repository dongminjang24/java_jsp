package com.example.app.reply;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Result;


public class ReplyFrontController extends HttpServlet {

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
		
		String target = req.getRequestURI().substring(req.getContextPath().length());//사용자가 요청한 경로 전		
		
		if(target.equals("/reply/replyList.re")) {
			new ReplyListController().execute(req,resp);
		}else if(target.equals("/reply/replyWrite.re")) {
			new ReplyWriteController().execute(req,resp);
		}else if(target.equals("/reply/replyDelete.re")) {
			new ReplyDeleteController().execute(req,resp);
		}else if(target.equals("/reply/replyUpdate.re")) {
			new ReplyUpdateController().execute(req,resp);
		}
		
		
		
	}
	
	
}
