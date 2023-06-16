package com.gnb.MyWasteFree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){ //홈페이지 메인화면 반환
        return "home";
    }

    @GetMapping("/myWaste/today/recycle")
    public String todayRecycle(){
        return "blog";
    }
    @GetMapping("/myWaste/ai")
    public String recycleByAI(){
        return "contact";
    }

    @GetMapping("/myWaste/store")
    public String pointStore(){
        return "shop";
    }


}

