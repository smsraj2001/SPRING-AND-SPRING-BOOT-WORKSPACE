package com.tvsmotor.exception;

import java.time.LocalDateTime;

public class ErrorInfo {
	
	private String errorMessage;
	private String statusCode;
	private LocalDateTime localDateTime;
	public ErrorInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ErrorInfo(String errorMessage, String statusCode, LocalDateTime localDateTime) {
		super();
		this.errorMessage = errorMessage;
		this.statusCode = statusCode;
		this.localDateTime = localDateTime;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}
	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}
	@Override
	public String toString() {
		return "ErrorInfo [errorMessage=" + errorMessage + ", statusCode=" + statusCode + ", localDateTime="
				+ localDateTime + "]";
	}
}
