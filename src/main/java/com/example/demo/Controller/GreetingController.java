package com.example.demo.Controller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

@Controller
public class GreetingController {



    @GetMapping("/greeting")           // 映射信息，访问方法为GET方法
    @ResponseBody                   //修改了@Controller的返回要求，返回结果是字符串
    public String greeting() {

        return "greeting";
    }







}
