package com.example.ex00.dependency;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j //로그 출력 라이브러리
@SpringBootTest // 현재 클래스는 단위 테스트 클래스임을 나타내고,junit라이브러리를 통해서 독립적으로 단위 테스트가 가능해진다.
class DependencyTest {

    @Autowired
    private Coding coding;

    @Test
    void dependencyInjectionTest(){
        log.info("coding = {}", coding);
        log.info("computer = {}", coding.getComputer());
        log.info("computer of Class = {}", coding.getComputer());
    }



}