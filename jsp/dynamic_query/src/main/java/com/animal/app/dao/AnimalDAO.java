package com.animal.app.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.animal.app.vo.AnimalVO;
import com.animal.app.vo.Criteria;
import com.mybatis.config.MybatisConfig;

public class AnimalDAO {
	public SqlSession sqlSession;
	
	public AnimalDAO() {
		sqlSession = MybatisConfig.getSqlSessionFactory().openSession(true);
		
	}
	
	public List<AnimalVO> find(Criteria criteria){
		return sqlSession.selectList("animal.find",criteria);
	}
	
}
