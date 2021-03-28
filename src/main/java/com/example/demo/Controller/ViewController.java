package com.example.demo.Controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller  //返回视图是用Controller，json用RequestController
public class ViewController {


    /*
     * 返回的不是视图，还是字符串？？？
     * 解决办法：类用@Controller，方法用 @RequestMapping("/hello")，或者@GetMapping("hi")
     *
     * */
    @GetMapping("hi")               // 映射信息，访问方法为GET方法
    public String hi(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "hi";                  //返回的是视图，即返回位于templates目录下的hi.html
    }


    @RequestMapping("/hello1")
    @ResponseBody
    public ModelAndView hello1(){
        ModelAndView mode = new ModelAndView();
        mode.setViewName("index");//返回的是视图，即返回位于templates目录下的index.html
        return mode;
    }



    @RequestMapping("/hello")
    public String hello() {

        return "index"; //返回的是视图，即返回位于templates目录下的index.html
    }


    //templates的模板
    @GetMapping("/t")               // 映射信息，访问方法为GET方法
    public String te(@RequestParam(name="name", required=false, defaultValue="江林钊") String name, Model model) {
        model.addAttribute("name", name);
        return "index";                  //返回的是视图，即返回位于templates目录下的hi.html
    }

}
