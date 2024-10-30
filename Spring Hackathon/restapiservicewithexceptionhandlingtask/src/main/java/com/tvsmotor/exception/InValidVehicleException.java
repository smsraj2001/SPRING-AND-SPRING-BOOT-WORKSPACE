package com.tvsmotor.exception;

public class InValidVehicleException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public InValidVehicleException(String message) {
        super(message);
    }
}