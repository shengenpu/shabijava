package com.example.fansi.Tool;

public class Result<T> {
    private String code;
    private String msg;
    private T data;
    private String token;
    public void setToken(String token){
        this.token=token;
    }

    public  String getToken(){
        return token;
    }
    public Result(T data) {
        this.data=data;
    }
    public Result() {
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    public static <T> Result<T> success(T data,String msg){
        Result<T> result=new Result<>(data);
        result.setCode("200");
        result.setMsg(msg);
        return result;
    }
    public static <T> Result<T> sgs(T data,String msg,String token){
        Result<T> result=new Result<>(data);
        result.setCode("200");
        result.setMsg(msg);
        result.setToken(token);
        return result;
    }

}
