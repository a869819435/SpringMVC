package com.yang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// @RestController 这个注解表示这个不会走视图解析
@Controller
@RequestMapping("/h")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model){
        // 封装数据
        model.addAttribute("msg","Hello,SpringMVCAnnotation!");
        // 会被视图解析器处理
        return "hello";
    }
}
