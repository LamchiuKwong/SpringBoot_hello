package com.example.demo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller //注解控制器
    public class HelloController {


    @RequestMapping("/index1")
    @ResponseBody  //返回字符串的的注解
    public  String jiang()//自定义字符串方法，需要返回语句
    {

        return "控制器页面";
    }



    }
