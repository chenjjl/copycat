package com.chen.rpc.bean;

import com.chen.rpc.constants.BeanType;

public class Response {
    private String requestId;
    private int code;
    private Exception exception;
    private Object result;
    private String type = BeanType.RESPONSE;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getType() {
        return type;
    }
}
