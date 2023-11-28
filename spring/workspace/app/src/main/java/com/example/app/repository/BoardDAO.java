package com.example.app.repository;

import com.example.app.domain.vo.BoardVO;
import com.example.app.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardDAO {

    private final BoardMapper boardMapper;
    public void save(BoardVO boardVO){
         boardMapper.insert(boardVO);
    };

    //수정
    public void setBoardVO(BoardVO boardVO){
         boardMapper.update(boardVO);
    };

    // 삭제
    public void remove(Long boardNumber){
        boardMapper.delete(boardNumber);
    };

    //조회
    public BoardVO findById(Long boardNumber){
        return boardMapper.select(boardNumber);
    };

    //전체 조회
    public List<BoardVO> findAll(){
        return boardMapper.selectAll();
    };
}


}
