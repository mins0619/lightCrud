package com.example.lightCrud.error.exception;

import com.example.lightCrud.error.ErrorCode;

public class NotFoundException extends BusinessException {
    public NotFoundException(String message, ErrorCode errorCode) {
        super(message, errorCode);
    }
}
