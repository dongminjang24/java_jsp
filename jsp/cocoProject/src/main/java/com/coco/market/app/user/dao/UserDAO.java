package com.coco.market.app.user.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.coco.market.app.user.vo.UserVO;
import com.mybatis.config.MybatisConfig;

public class UserDAO {

	public SqlSession sqlSession;
	
	public UserDAO() {
		sqlSession = MybatisConfig.getSqlSessionFactory().openSession(true);
		
	}
	
	public void signUp(UserVO userVO) {
		sqlSession.insert("user.sign_up",userVO);
	}
	
	public boolean checkEmail(String userEmail) {
		return (Integer)sqlSession.selectOne("user.find_email",userEmail) == 0;

	}
	public int signIn(String userEmail,String userPassword) {
		HashMap<String,String> signMap = new HashMap<String,String>();
		signMap.put("userEmail",userEmail);
		signMap.put("userPassword",userPassword);
		return sqlSession.selectOne("user.signIn",signMap);
	}
	
	public String getUserEmail(int userNumber) {
		return sqlSession.selectOne("user.getUserEmail",userNumber);
	}
}
