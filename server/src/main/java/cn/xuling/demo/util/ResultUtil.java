package cn.xuling.demo.util;

import cn.xuling.demo.Result;

public class ResultUtil {

    public static Result<Object> success(Object data) {
        Result<Object> result = new Result<>();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(data);
        return result;
    }

    public static Result success() {
        Result<Object> result = new Result<>();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(null);
        return result;
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}
