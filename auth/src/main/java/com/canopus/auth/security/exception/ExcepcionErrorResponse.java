package com.canopus.auth.security.exception;

import java.util.Map;

public class ExcepcionErrorResponse {

    private int code;

    private String status;

    private String message;

//    private Map<String, Object> data;

    public ExcepcionErrorResponse(int code, String status, String message) {
        this.code = code;
        this.status = status;
        this.message = message;
    }

//    public ExcepcionErrorResponse(int code, String status, String message, Map<String, Object> data) {
//        this.code = code;
//        this.status = status;
//        this.message = message;
//        this.data = data;
//    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

//    public Map<String, Object> getData() {
//        return data;
//    }
//
//    public void setData(Map<String, Object> data) {
//        this.data = data;
//    }
}
