package com.example.ex02.domain.vo;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class UserVO {

    String id;
    String password;

}
