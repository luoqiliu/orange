package com.miaoheng.orange.common;

/**
 * Created by luoqi on 16/12/6.
 */
public enum ErrorCode {

    SUCCESS(0, "success"),

    SYSTEM_ERROR(-1, "system error"),

    INVALID_PARAM(1, "invalid param");


    private int code;
    private String msg;

    ErrorCode(int code, String msg){
        this.code = code;
        this.msg = msg;

    }


    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
