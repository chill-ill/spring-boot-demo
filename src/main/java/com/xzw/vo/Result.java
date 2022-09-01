package com.xzw.vo;

import lombok.Data;

/**
 * @author xzw
 * @version 1.0
 * @date 2022/9/1 21:12
 */
@Data
public class Result<T> {

    private Integer code;

    private String msg;

    private T data;

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Result success() {
        return new Result(200, "成功");
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(200, "成功", data);
    }

    public static <T> Result<T> success(T data, String msg) {
        return new Result<>(200, msg, data);
    }

    public static Result fail() {
        return new Result(500, "失败");
    }

    public static <T> Result<T> fail(String msg) {
        return new Result<>(500, msg);
    }
}
