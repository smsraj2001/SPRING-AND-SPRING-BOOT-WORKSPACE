package com.tvsmotor.service;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tvsmotor.exception.ErrorInfo;
import com.tvsmotor.exception.IDNotFoundException;
import com.tvsmotor.exception.InValidVehicleException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IDNotFoundException.class)
    public ResponseEntity<ErrorInfo> handleIDNotFoundException(IDNotFoundException exception) {
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setErrorMessage(exception.getMessage());
        errorInfo.setStatusCode(HttpStatus.BAD_REQUEST.toString());
        errorInfo.setLocalDateTime(LocalDateTime.now());
        return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InValidVehicleException.class)
    public ResponseEntity<ErrorInfo> handleInValidVehicleException(InValidVehicleException exception) {
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setErrorMessage(exception.getMessage());
        errorInfo.setStatusCode(HttpStatus.BAD_REQUEST.toString());
        errorInfo.setLocalDateTime(LocalDateTime.now());
        return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
    }
}
