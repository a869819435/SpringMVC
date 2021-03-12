package com.yang.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        ModelAndView modelAndView = new ModelAndView();
        // 业务代码

        // 业务返回结果
        String result = "HelloSpringMVC";
        // 键值对
        modelAndView.addObject("msg",result);


        // 视图跳转,写文件名称就好，前后缀已经配置了
        modelAndView.setViewName("test");
        return null;
    }
}
