package com.example.week6.Api;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ApiExeption extends RuntimeException {
    public ApiExeption(String message) {
        super(message);

    }
}