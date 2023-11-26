package com.example.ex01.myBatis;


import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@RequiredArgsConstructor
public class MyBatisConfig {

    private final ApplicationContext applicationContext;

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.hikari") // configuration에 있는 파일을 여기다가 주입하겠다는 것.
    public HikariConfig hikariConfig() {
        return new HikariConfig();
    }

    @Bean
    public DataSource dataSource() {
        return new HikariDataSource(hikariConfig());
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        //sql을 지을 때 필요한 설정들을 넣을 수 있는 객체
        sqlSessionFactoryBean.setDataSource(dataSource());
        sqlSessionFactoryBean.addMapperLocations(applicationContext.getResources("classpath:/mapper/*.xml")); //resource까지의 경로를 applicationContext가 알고 있음
        sqlSessionFactoryBean.setConfigLocation(applicationContext.getResource("classpath:/config/config.xml"));


        try {
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBean.getObject();
            sqlSessionFactory.getConfiguration().setMapUnderscoreToCamelCase(true);
            return sqlSessionFactory;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
