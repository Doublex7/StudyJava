package cn.xuling.demo.Controller;

import cn.xuling.demo.Entity.User;
import cn.xuling.demo.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {


    @SuppressWarnings("all")
    @Autowired
    UserMapper userMapper;


    @RequestMapping(value = "/")
    public String home() {
        return "Home Page";
    }


    @RequestMapping(value = "/test")
    public String test() {
        return "Test Page";
    }


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name", required = false, defaultValue = "ling") String personName) {
        if (personName != null) {
            return "Hello Spring Boot " + ", I am " + personName + "........哈哈哈自动编译了";
        }
        return "Hello  Spring Boot";
    }

    @RequestMapping(value = "/hi/{id}", method = RequestMethod.GET)
    public String say(@PathVariable("id") String id) {
        return "The value of id is " + id;
    }

    @GetMapping("/list")
    public List<User> list() {
        return userMapper.list();
    }

    @GetMapping("/list/{name}")
    public List<User> listByUsername(@PathVariable("name") String name) {
        return userMapper.listByUsername(name);
    }

    @GetMapping("/get/{username}/{password}")
    public User get(@PathVariable("username") String username, @PathVariable("password") String password) {
        return userMapper.get(username, password);
    }

    @GetMapping("/get/bad/{username}/{password}")
    public User getBadUser(@PathVariable("username") String username, @PathVariable("password") String password) {
        return userMapper.getBadUser(username, password);
    }

}