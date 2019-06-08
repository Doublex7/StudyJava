package cn.xuling.demo.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class TestController {

    @RequestMapping("/test")
    String test() {
        "Just Test..."
    }
}
