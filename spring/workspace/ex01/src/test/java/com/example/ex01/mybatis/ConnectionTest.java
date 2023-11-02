package com.example.ex01.mybatis;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootTest
@Slf4j
public class ConnectionTest {

    @Autowired
    private DataSource dataSource;

    @Test
    public void dataSourceTest(){
        try(Connection connection = dataSource.getConnection()){
            log.info("datasource connection = {}", connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
