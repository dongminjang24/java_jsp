package com.example.app.file.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.example.app.file.vo.FileVO;
import com.mybatis.config.MybatisConfig;

public class FileDAO {
	public SqlSession sqlsession;
	public FileDAO() {
	sqlsession = MybatisConfig.getSqlSessionFactory ().openSession (true);
	}
	public void insert(FileVO fileVo) {
	sqlsession.insert("file.insert", fileVo) ;
	}
	public List<FileVO> select(int boardNumber) {
		return sqlsession.selectList("file.select",boardNumber);
	}
	public void delete(int boardNumber) {
		sqlsession.delete("file.delete",boardNumber);
	}
}
