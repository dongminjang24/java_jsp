package com.example.ex02.controller;


import com.example.ex02.domain.vo.MemberVO;
import com.example.ex02.domain.vo.ProductVO;
import com.example.ex02.domain.vo.TaskVO;
import com.example.ex02.domain.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/practice01")
//    public void practice1(String productName,int productPrice, int productStock,String brand, Model model) {
    public void practice1(Model model) {
//        model.addAttribute("productName",productName);
//        model.addAttribute("productPrice",productPrice);
//        model.addAttribute("productStock",productStock);
//        model.addAttribute("brand",brand);

//        log.info("productName={}",productName);
//        log.info("productPrice={}",productPrice);
//        log.info("productStock={}",productStock);
//        log.info("brand={}",brand);

        model.addAttribute("product", new ProductVO());

    }

    @PostMapping("/practice01")
//    public void practice1(String productName,int productPrice, int productStock,String brand, Model model) {
    public String practicePost(ProductVO productVO) {
        return "/ex/practice-result";
    }


    @GetMapping("/practice02")
    public void practice02(@ModelAttribute("task") TaskVO taskVO) {

    }

    @PostMapping("/practice02")
    public String practiceResult(@ModelAttribute("task") TaskVO taskVO) {
        return "/ex/practice02-result";
    }

    @GetMapping("/login")
    public void practice4(@ModelAttribute("user") UserVO userVO) {


        log.info("id={}",userVO.getId());
        log.info("password={}",userVO.getPassword());
    }

    @PostMapping("/login")
    public String practice5(@ModelAttribute("user") UserVO userVO) {

        if (userVO.getId().equals("admin") ) {
            return "redirect:/ex/admin";
        }
        if (userVO.getId().equals("user")) {
            return "redirect:/ex/user";
        }
        return "redirect:/ex/login";
    }

    @GetMapping("/admin")
    public void practiceAdmin(@ModelAttribute("user") UserVO userVO) {

    }
    @GetMapping("/user")
    public void practiceUser(@ModelAttribute("user") UserVO userVO) {

    }





    //[실습 1]
    //외부에서 상품명, 상품가격, 상품재고, 브랜드 전달받아서 화면에 전송
    // 화면에서 4개 정보 입력 후 form태그로 전송한다.


    //[실습 2]
    //Taskvo 선언
    //int num, int kor, int eng, int math 선언
    //총점과 평균 점수 화면에 출력

    //[실습 3]
    //아이디와 비밀번호를 입력받은 후 아이디가 admin일 경우 admin.htmt로 이동
    // 아이디가 user일 경우 user.htmL로 이동

    //- Login.htmt : 아이디와 비밀번호 입력 페이지 출력
    //- admin.html : 관리자 페이지 출력
    //- user.htmt : 일반 회원 페이지 출


}
