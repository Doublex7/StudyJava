package cn.xuling.demo.Controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class IndexController {


    @RequestMapping("/groovy")
    String Index() {
        "Hello. This Page from Groovy."
    }
}
