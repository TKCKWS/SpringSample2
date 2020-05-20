package com.example.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemoController {

    @GetMapping("/memo/memo")
    public String getHome(Model model) {

        return "web/memo/memo";
    }
}
