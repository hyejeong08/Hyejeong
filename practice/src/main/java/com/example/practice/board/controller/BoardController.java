package com.example.practice.board.controller;


import com.example.practice.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board/*")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @RequestMapping("mainPage")
    public String mainPage(){

        System.out.println("mainPage 싫행중입니다.");

        return "board/mainPage";
    }
}
