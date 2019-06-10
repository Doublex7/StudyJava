package cn.xuling.demo.controller;

import cn.xuling.demo.Result;
import cn.xuling.demo.entity.User;
import cn.xuling.demo.mapper.UserMapper;
import cn.xuling.demo.service.IUserService;
import cn.xuling.demo.util.ResultUtil;
import com.mysql.cj.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @SuppressWarnings("all")
    @Autowired
    private UserMapper userMapper;

    private final IUserService iUserService;

    public UserController(IUserService iUserService) {
        this.iUserService = iUserService;
    }

    @RequestMapping("/list")
    public List<User> list() {
        return userMapper.list();
    }

    @RequestMapping(value = "/login/{username}/{password}", method = RequestMethod.POST)
    public Result login(@PathVariable("username") String username, @PathVariable("password") String password) {
        if (StringUtils.isNullOrEmpty(username) || StringUtils.isNullOrEmpty(password)) {
            return ResultUtil.error(-1, "用户名或密码为空,请填写完整!");
        }
        return iUserService.login(username, password);
    }
}