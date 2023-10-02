package com.example.app.reply.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.example.app.reply.vo.ReplyDTO;
import com.example.app.reply.vo.ReplyVO;
import com.mybatis.config.MybatisConfig;

public class ReplyDAO {
	public SqlSession sqlSession;
	
	public ReplyDAO() {
		sqlSession = MybatisConfig.getSqlSessionFactory() .openSession(true);
	}
	
	public List<ReplyDTO> selectAll(int boardNumber){
		return sqlSession.selectList("reply.selectAll", boardNumber);
	}
	
	public void insert(ReplyVO replyVO){
		sqlSession.selectList("reply.insert", replyVO);
	}
	
	public void delete(int replyNumber){
		sqlSession.delete("reply.delete", replyNumber);
	}
	public void update(ReplyVO replyVO) {
		sqlSession.update("reply.update",replyVO);
	}
}
