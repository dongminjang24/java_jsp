package com.example.app.controller;


import com.example.app.domain.vo.BoardVO;
import com.example.app.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board/*")
public class BoardController {
    private final BoardService boardService;

    // 게시글 목록
    @GetMapping("/list")
    public void list(Model model) {
        model.addAttribute("board", boardService.showAll());
    }


    // 게시글 등록
    @GetMapping("/write")
    public void write() {;}

    @PostMapping("/write")
    public RedirectView write(BoardVO boardVO, RedirectAttributes redirectAttributes) {
        boardService.register(boardVO);
        Long boardNumber = boardVO.getBoardNumber();
//        redirectAttributes.addAttribute("boardNumber",boardNumber);//쿼리스트링 방식
        // 주로 리다이렉트시 사용하며, session의 Flash영역을 사용하여 request가 초기화된 뒤 Flash영역에 담아뒀던 데이터를 꺼내올 수 있다.
        /*
         * */
        redirectAttributes.addFlashAttribute("boardNumber",boardNumber);//플래시 방식
        return new RedirectView("/board/list");
    }

    // 게시글 상세보기
    @GetMapping(value = {"/read","/update"}) // 상세에 있던 데이터가 똑같이 수정페이지에도 넘어가야하므로
    public void read(Long boardNumber, Model model) {
        BoardVO board = boardService.show(boardNumber);
        model.addAttribute("board", board);
    }

    // 게시글 수정
    @PostMapping("/update")
    public RedirectView update(BoardVO boardVO,RedirectAttributes redirectAttributes){
        boardService.modify(boardVO);
        redirectAttributes.addAttribute("boardNumber", boardVO.getBoardNumber());
        return new RedirectView("/board/read?boardNumber=" + boardVO.getBoardNumber()); // flash는 화면에서만 받을 수 있고, 쿼리 스트링으로 옮겨줘야가능함.
    }


    // 게시글 삭제
    @GetMapping("/delete")
    public RedirectView delete(Long boardNumber) {

        boardService.remove(boardNumber);
        return new RedirectView("/board/list");
    }


}
