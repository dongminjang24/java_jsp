package com.example.app.service;

import com.example.app.domain.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
public class CommunityBoardServiceTest {

    @Autowired @Qualifier("community")
    private  BoardService boardService;
    @Test
    public void insertTest() {
        BoardVO boardVO = new BoardVO();
        boardVO.create("새로 작성한 게시글 제목", "장동민", "새로 작성한 게시글 내용");
        boardService.register(boardVO);
    }

    @Test
    public void updateTest() {
        BoardVO boardVO = new BoardVO();
        boardVO.setBoardNumber(4L);
        boardVO.setBoardTitle("수정한 게시글 제목");
        boardVO.setBoardWriter("수정자 장동민");
        boardVO.setBoardContent("수정한 게시글 내용");
        LocalTime now = LocalTime.now();
        String nowTime = String.valueOf(now);
        boardVO.setBoardUpdateDate(nowTime);
        boardService.modify(boardVO);
    }


    @Test
    public void selectTest() {
        BoardVO select = boardService.show(1L);
        log.info("boardVO={}",select);
    }


    @Test
    public void selectAllTest() {
        List<BoardVO> result = boardService.showAll();
        result.stream().map(BoardVO::getBoardTitle).forEach(log::info);
    }
}