package com.example.app.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Result;


public class BoardFrontController extends HttpServlet {

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
		
		if(target.equals("/board/boardListOk.bo")) {
			result = new BoardListOkController().execute(req,resp);
		}else if(target.equals("/board/boardWrite.bo")) {
			result = new BoardWriteController().execute(req, resp);
		}else if(target.equals("/board/boardWriteOk.bo")) {
			result = new BoardWriteOkController().execute(req, resp);
		}else if(target.equals("/board/boardDetail.bo")) {
			result = new BoardDetailController().execute(req, resp);
		}else if(target.equals("/board/boardDelete.bo")) {
			result = new BoardDeleteController().execute(req, resp);
		}else if(target.equals("/board/boardUpdate.bo")) {
			result = new BoardUpdateController().execute(req, resp);
		}else if(target.equals("/board/boardUpdateOk.bo")) {
			result = new BoardUpdateOkController().execute(req, resp);
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
