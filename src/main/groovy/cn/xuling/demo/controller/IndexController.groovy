package cn.xuling.demo.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/")
class IndexController {


    @Value('${spring.application.name}')
    name

    @RequestMapping("/")
    String index() {
        name + ' From Groovy!'
    }


    @RequestMapping("/groovy")
    groovy() {
        "Hello. This Page from Groovy."
    }
}
