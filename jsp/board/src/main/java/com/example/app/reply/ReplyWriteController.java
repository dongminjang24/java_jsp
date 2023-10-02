package com.example.app.reply;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.Result;
import com.example.app.reply.dao.ReplyDAO;
import com.example.app.reply.vo.ReplyVO;

public class ReplyWriteController implements Execute {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException {
		req.setCharacterEncoding("UTF-8");
		ReplyVO replyVO = new ReplyVO();
		replyVO.setBoardNumber(Integer.valueOf(req.getParameter("boardNumber")));
		replyVO.setMemberNumber(Integer.valueOf(req.getParameter("memberNumber")));
		replyVO.setReplyContent(req.getParameter("replyContent"));
		
		
		new ReplyDAO().insert(replyVO);
		return null;
	}

}
