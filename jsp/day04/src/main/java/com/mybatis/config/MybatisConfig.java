package com.mybatis.config;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisConfig {
	private static SqlSessionFactory sqlSessionFactory;
	
	static {
		try {
			//static 블럭은 생성자로 생성되는데, 맨처음에만 실행
			String resource = "./com/mybatis/config/config.xml";//마침표는 src임
			Reader reader = Resources.getResourceAsReader(resource);//설정파일을 reader에 담아줌
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			System.out.println("초기화 문제 발생,MyBatisConfig.java");
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}


//	{
//		초기화 블럭, 생성자로 생성될때마다 실행,
//	}

}
