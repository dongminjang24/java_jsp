package com.example.ex01.myBatis;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootTest
@Slf4j
public class ConnectionText {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    void dataSourceTest() {

        // 자동으로 클로즈됨.
        try (Connection connection = dataSource.getConnection()) {
            log.info("datasource connection = {}",connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void sqlSessionTest() {
        try (SqlSession sqlSession = sqlSessionFactory.openSession(true);
             Connection connection = sqlSession.getConnection();
        ) {
            log.info("sqlSession connection = {}",connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
