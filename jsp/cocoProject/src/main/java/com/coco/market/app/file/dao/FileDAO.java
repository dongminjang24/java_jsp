package com.coco.market.app.file.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.coco.market.app.file.vo.FileVO;
import com.mybatis.config.MybatisConfig;

public class FileDAO {
	public SqlSession sqlsession;
	public FileDAO() {
	sqlsession = MybatisConfig.getSqlSessionFactory ().openSession (true);
	}
	public void insert(FileVO fileVo) {
	sqlsession.insert("file.insert", fileVo) ;
	}
	public List<FileVO> select(long itemNumber) {
		return sqlsession.selectList("file.select",itemNumber);
	}
	public void delete(int itemNumber) {
		sqlsession.delete("file.delete",itemNumber);
	}
	public FileVO getName(String fileName) {
		return sqlsession.selectOne("file.getName",fileName);
	}
}
