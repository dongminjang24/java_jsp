package com.example.app.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.FlashMap;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class BoardControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;// 내장된 was에 대한 정보를 가지고 있음.

    //브라우저에서 url을 요청한 것과 같은 환경을 구성해준다.
    private MockMvc mockMvc;

    @BeforeEach
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    void list() throws Exception {
        ModelMap modelMap = mockMvc.perform(MockMvcRequestBuilders.get("/board/list")).andReturn().getModelAndView().getModelMap();
        log.info("boards = {} ", modelMap);

    }

    @Test
    void write() throws Exception {
        FlashMap flashMap = mockMvc.perform(MockMvcRequestBuilders.post("/board/write")
                .param("boardTitle", "새로 작성한 글 제목")
                .param("boardContent", "새로 작성한 글 내용")
                .param("boardWriter", "Test")
        ).andReturn().getFlashMap();
        log.info("FlashMap={}",flashMap);
    }


    @Test
    void read() throws Exception {
        ModelMap modelMap = mockMvc.perform(MockMvcRequestBuilders.get("/board/read")
                .param("boardNumber", "22")).andReturn().getModelAndView().getModelMap();
        log.info("modelMap={}", modelMap);
    }

    @Test
    void update() throws Exception {
        ModelMap modelMap = mockMvc.perform(MockMvcRequestBuilders.post("/board/update").param("boardNumber", "22")
                .param("boardTitle", "수정된 게시글 코코제목")
                .param("boardContent", "수정된 게시글 코코내용")).andReturn().getModelAndView().getModelMap();

        log.info("modelMap={}",modelMap);
    }

    @Test
    void delete() throws Exception {
        ResultActions boardNumber = mockMvc.perform(MockMvcRequestBuilders.get("/board/delete").param("boardNumber", "22"))
                .andExpect(MockMvcResultMatchers.status().is3xxRedirection());
        log.info("boardNumber={}",boardNumber);
    }
}