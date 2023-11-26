package com.example.ex01.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Bean;

@Mapper
public interface TimeMapper {

//    @Select("SELECT SYSDATE FROM DUAL")
    public String getTime();



}
