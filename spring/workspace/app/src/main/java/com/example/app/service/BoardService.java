package com.example.app.service;


import com.example.app.domain.vo.BoardVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BoardService {
    public void register(BoardVO boardVO);

    //수정
    public void modify(BoardVO boardVO);

    // 삭제
    public void remove(Long boardNumber);

    //조회
    public BoardVO show(Long boardNumber);

    //전체 조회
    public List<BoardVO> showAll();
}
