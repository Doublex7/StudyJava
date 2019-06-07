package cn.xuling.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WeController {


    @RequestMapping(value = "thymeleaf")
    public String thymeleaf() {
        return "thymeleaf";
    }
}