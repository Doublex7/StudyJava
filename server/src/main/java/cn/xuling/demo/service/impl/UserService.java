package cn.xuling.demo.service.impl;

import cn.xuling.demo.Result;
import cn.xuling.demo.entity.User;
import cn.xuling.demo.mapper.UserMapper;
import cn.xuling.demo.service.IUserService;
import cn.xuling.demo.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @SuppressWarnings("all")
    @Autowired
    private UserMapper userMapper;


    /**
     * 登录
     * @param username
     * @param password
     * @return
     *  0 -> 成功
     *  1 -> 用户名不存在
     *  2 -> 密码错误
     */
    @Override
    public Result login(String username, String password) {
         User user = userMapper.getUnionUserByUsername(username);
         if (user == null) {
             return ResultUtil.error(1, "用户名不存在");
         }
         if (!password.equals(user.getPassword())) {
             return ResultUtil.error(2, "密码错误");
         }
         return ResultUtil.success(user);
    }
}
