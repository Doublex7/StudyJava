package cn.xuling.demo.service;

import cn.xuling.demo.Result;

public interface IUserService {
    Result login(String username, String password);
}