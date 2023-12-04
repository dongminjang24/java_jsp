package com.example.app.mapper;

import com.example.app.domain.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalTime;
import java.util.List;

@SpringBootTest
@Slf4j
public class BoardMapperTest {

    @Autowired
    private BoardMapper boardMapper;

    @Test
    public void insertTest() {
        BoardVO boardVO = new BoardVO();
        boardVO.create("새로 작성한 게시글 제목2", "장동민2", "새로 작성한 게시글 내용2");
        boardMapper.insert(boardVO);
        log.info("boardNumber ={}",boardVO.getBoardNumber());
    }

    @Test
    public void updateTest() {
        BoardVO boardVO = new BoardVO();
       boardVO.setBoardNumber(1L);
       boardVO.setBoardTitle("수정한 게시글 제목");
       boardVO.setBoardWriter("수정자 장동민");
       boardVO.setBoardContent("수정한 게시글 내용");
        LocalTime now = LocalTime.now();
        String nowTime = String.valueOf(now);
        boardVO.setBoardUpdateDate(nowTime);
        boardMapper.update(boardVO);
    }


    @Test
    public void selectTest() {
        BoardVO select = boardMapper.select(1L);
        log.info("boardVO={}",select);
    }


    @Test
    public void selectAllTest() {
        List<BoardVO> result = boardMapper.selectAll();
        result.stream().map(BoardVO::getBoardTitle).forEach(log::info);
    }
}
