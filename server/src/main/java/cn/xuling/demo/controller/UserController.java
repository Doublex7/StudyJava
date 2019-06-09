package cn.xuling.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @RequestMapping("/user")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password) {

        if ("ling".equals(username) && "Ll0809".equals(password)) {
            return "登录成功";
        }
        return "登录失败";
    }
}
