package com.example.ex01.myBatis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
@Slf4j
public class ConnectionText {

    @Autowired
    private DataSource dataSource;

}
