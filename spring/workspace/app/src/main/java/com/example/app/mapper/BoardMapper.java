package com.example.app.mapper;


import com.example.app.domain.vo.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    //추가
    public void insert(BoardVO boardVO);

    //수정
    public void update(BoardVO boardVO);

    // 삭제
    public void delete(Long boardNumber);

    //조회
    public BoardVO select(Long boardNumber);

    //전체 조회
    public List<BoardVO> selectAll();
}
