package com.example.app.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TimeMapper {

//    @Select("SELECT SYSDATE FROM DUAL")
    public String getTime();



}
