package com.example.ex02.domain.vo;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class TaskVO {

    private int number;
    private int kor;
    private int eng;
    private int math;

    public int score(){
        return kor + eng + math;
    };
    public double average(){
        return score() / 3.0;
    } ;
}
