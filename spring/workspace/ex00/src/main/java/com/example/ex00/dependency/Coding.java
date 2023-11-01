package com.example.ex00.dependency;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
@RequiredArgsConstructor
public class Coding {

//    @Autowired
   /* 단위테스트를 제외하고는 무조건 생성자 주입을 하기,
     1. 순환참조 시 예외가 발생하지 않기 때문에, 스택오버플로우 발생
     2. 다른 곳에서 수정이 가능하기 때문에 심각한 문제가 생길 수 있음.
     3. 주입이 되지 않아도 객체는 생성되기 때문에 NPE방어 불가.
    */
    private final Computer computer;
//    int data; 주입 안함 final붙은 것만 주입됨.

    /*
    생성자 주입, final
    메모리에 필드를 할당하면서 초기값이 주입되므로 final키워드를 사용할 수 있음
    주입이 되지 않으면 객체 자체가 생성되지 않으므로 NPE방어가능.
    1. 순환참조 발생 시에 예외발생.
    2. 다른곳에서 수정불가.
    3. NPE 방어 가능.
    @Autowired
    public Coding(Computer computer) {
        this.computer = computer;
    }*/

    //    public Coding() {
//    }
//
//    public Computer getComputer() {
//        return computer;
//    }
//
//    public void setComputer(Computer computer) {
//        this.computer = computer;
//    }
//
//    @Override
//    public String toString() {
//        return "Coding{" +
//                "computer=" + computer +
//                '}';
//    }
}
