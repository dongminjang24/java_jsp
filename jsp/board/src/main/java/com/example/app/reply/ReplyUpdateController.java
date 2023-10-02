package com.example.app.reply;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.Result;
import com.example.app.reply.dao.ReplyDAO;
import com.example.app.reply.vo.ReplyVO;

public class ReplyUpdateController implements Execute {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException {
		resp.setCharacterEncoding("UTF-8");
		int replyNumber = Integer.valueOf(req.getParameter("replyNumber")); 
		String replyContent = req.getParameter("replyContent");
		ReplyVO replyVO = new ReplyVO();
		ReplyDAO replyDAO = new ReplyDAO();

		replyVO.setReplyNumber(replyNumber);
		replyVO.setReplyContent(replyContent);
		replyDAO.update(replyVO);
		return null;
	}

}
