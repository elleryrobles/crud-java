package com.canopus.auth.security.exception;

import lombok.Data;

@Data
public class ExcepcionErrorResponse {

    private String appCode;

    private int status;

    private String message;

    public ExcepcionErrorResponse(String appCode, int status, String message) {
        this.appCode = appCode;
        this.status = status;
        this.message = message;
    }
}
