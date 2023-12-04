package com.example.app.mapper;

import com.example.app.domain.vo.BoardVO;
import com.example.app.repository.BoardDAO;
import com.example.app.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;


@Qualifier("community")
@RequiredArgsConstructor
@Service
public class CommunityBoardService implements BoardService {

    private final BoardDAO boardDAO;

    @Override
    public void register(BoardVO boardVO) {
        boardDAO.save(boardVO);
    }

    @Override
    public void modify(BoardVO boardVO) {
        boardDAO.setBoardVO(boardVO);

    }

    @Override
    public void remove(Long boardNumber) {
        boardDAO.remove(boardNumber);

    }

    @Override
    public BoardVO show(Long boardNumber) {
        return boardDAO.findById(boardNumber);
    }

    @Override
    public List<BoardVO> showAll() {
        return boardDAO.findAll();
    }
}
