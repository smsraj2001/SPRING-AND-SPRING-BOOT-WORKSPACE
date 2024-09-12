package com.tvsmotor.service;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tvsmotor.exception.ErrorInfo;
import com.tvsmotor.exception.IdNotFoundException;
import com.tvsmotor.exception.InValidCategoryException;
import com.tvsmotor.exception.InValidPriceException;
import com.tvsmotor.exception.OutOfStockException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<ErrorInfo> handleIdException(IdNotFoundException inValidIdException)
	{
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorMessage(inValidIdException.getMsg());
		errorInfo.setStatusCode(HttpStatus.BAD_REQUEST.toString());
		errorInfo.setLocalDateTime(LocalDateTime.now());
		return new ResponseEntity<ErrorInfo>(errorInfo, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(InValidCategoryException.class)
	public ResponseEntity<ErrorInfo> handleCategoryException(InValidCategoryException inValidCategoryException)
	{
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorMessage(inValidCategoryException.getMsg());
		errorInfo.setStatusCode(HttpStatus.BAD_REQUEST.toString());
		errorInfo.setLocalDateTime(LocalDateTime.now());
		return new ResponseEntity<ErrorInfo>(errorInfo, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(InValidPriceException.class)
	public ResponseEntity<ErrorInfo> handlePriceException(InValidPriceException inValidPriceException)
	{
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorMessage(inValidPriceException.getMsg());
		errorInfo.setStatusCode(HttpStatus.BAD_REQUEST.toString());
		errorInfo.setLocalDateTime(LocalDateTime.now());
		return new ResponseEntity<ErrorInfo>(errorInfo, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(OutOfStockException.class)
	public ResponseEntity<ErrorInfo> handleStockException(OutOfStockException inValidStockException)
	{
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorMessage(inValidStockException.getMsg());
		errorInfo.setStatusCode(HttpStatus.BAD_REQUEST.toString());
		errorInfo.setLocalDateTime(LocalDateTime.now());
		return new ResponseEntity<ErrorInfo>(errorInfo, HttpStatus.BAD_REQUEST);
	}
}
