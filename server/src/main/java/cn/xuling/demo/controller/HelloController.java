package cn.xuling.demo.controller;

import cn.xuling.demo.entity.User;
import cn.xuling.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class HelloController {


    @Value("${spring.application.name}")
    private String name;


    @Value("${default:default}")
    private String defaultName;


    @SuppressWarnings("all")
    @Autowired
    UserMapper userMapper;


    @RequestMapping("/test/default")
    public String testName() {
        return defaultName;
    }


    @RequestMapping("/user/{name}")
    public User getUser(@PathVariable("name") String name) {
        List<User> userList = userMapper.listByUsername(name);

        if (userList.size() == 0) {
            return null;
        }
        return userList.get(0);
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