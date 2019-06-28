package com.vigorous.emall.base;

import lombok.Data;

/**
 * @author JiaoTailang
 * @version 1.0
 * @date 2019/6/28 14:44
 */
@Data
public class EmallResult {

    private Integer status;

    private String msg;

    private Object content;

    public static EmallResult build(Integer code, String message, Object data) {
        return new EmallResult(code,message,data);
    }

    public static EmallResult ok(Object data) {
        return new EmallResult(data);
    }

    public static EmallResult ok() {
        return new EmallResult(null);
    }

    public EmallResult(Integer code, String message, Object data) {
        this.status = code;
        this.msg = message;
        this.content = data;
    }

    public EmallResult(Object data) {
        this.status = 200;
        this.msg = "ok";
        this.content = data;
    }
}
