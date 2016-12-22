package com.miaoheng.orange.common;

import lombok.Data;

/**
 * Created by luoqi on 16/12/6.
 */

@Data
public class Result<T> {

    private int                  code;

    private String                  msg;

    private T                    data;

    public Result(){
        this.code = ErrorCode.SUCCESS.getCode();
    }

    public  Result<T> success(){
        this.code = ErrorCode.SUCCESS.getCode();
        this.msg = ErrorCode.SUCCESS.getMsg();
        return this;
    }

    public Result<T> success(T data){
        this.code = ErrorCode.SUCCESS.getCode();
        this.msg = ErrorCode.SUCCESS.getMsg();
        this.data = data;
        return this;
    }

    public  Result<T> error(ErrorCode errorCode){
        this.code = errorCode.getCode();
        this.msg = errorCode.getMsg();
        return this;
    }


}
