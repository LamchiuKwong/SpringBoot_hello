package com.example.demo.Controller;


import com.example.demo.Demo.ShiTi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShiTiController {

    @RequestMapping("/shiti")

    public ShiTi shiti(){


        ShiTi shiti=new ShiTi();
        shiti.setId(1);
        shiti.setName("江林钊");
        shiti.setSex("man");
        return  shiti ;

    }




}
