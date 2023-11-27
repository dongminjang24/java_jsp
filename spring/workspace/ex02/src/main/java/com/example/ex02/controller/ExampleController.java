package com.example.ex02.controller;


import com.example.ex02.domain.vo.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/ex/*")
@Slf4j
public class ExampleController {

    //    @RequestMapping("/ex01")
    @GetMapping("/ex01")
    public void ex01() {
        log.info("ex01........");
    }

    @GetMapping("/ex02")
    public void ex02(String name) {
        log.info(name);
    }

    @GetMapping("/ex03")
    public void ex03(MemberVO memberVO) {
        log.info("member : {}",memberVO);
    }


    @GetMapping("/ex04")
    public void ex04(@RequestParam("id")String name, int age) {
        log.info("name={}",name);
        log.info("age={}",age);
    }

    @GetMapping("/ex05")
    public void ex05(@ModelAttribute("member") MemberVO memberVO, @ModelAttribute("gender") String gender) {
        log.info("memberVO={}",memberVO);
        log.info("gender={}",gender);
    }

    @GetMapping("/ex06")
    public void ex06(String name, int age, String gender, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        model.addAttribute("gender", gender);
    }

    @GetMapping("/ex07")
    public void ex07(@RequestParam("data")List<String> data) {
        log.info("data = {}",data);
    }
}
