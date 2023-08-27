package com.example.week6.Api;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ApiException extends RuntimeException {
    public ApiException(String message) {
        super(message);

    }
}