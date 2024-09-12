package com.tvsmotor.service;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tvsmotor.exception.ErrorInfo;
import com.tvsmotor.exception.IdNotFoundException;
import com.tvsmotor.exception.InValidAgeException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	/*
	@ExceptionHandler(InValidAgeException.class)
	public String handleErrorForAge(InValidAgeException exception)
	{
		return exception.getMsg();
	}
	
	@ExceptionHandler(IdNotFoundException.class)
	public String handleErrorForIdNotFound(IdNotFoundException exception)
	{
		return exception.getMsg();
	}
	*/
	
	@ExceptionHandler(InValidAgeException.class)
	public ResponseEntity<ErrorInfo> handleAgeException(InValidAgeException inValidAgeException)
	{
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorMessage(inValidAgeException.getMsg());
		errorInfo.setStatusCode(HttpStatus.BAD_REQUEST.toString());
		errorInfo.setLocalDateTime(LocalDateTime.now());
		
		return new ResponseEntity<ErrorInfo>(errorInfo, HttpStatus.BAD_REQUEST);
	}

}
