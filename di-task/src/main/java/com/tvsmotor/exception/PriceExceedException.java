package com.tvsmotor.exception;

public class PriceExceedException extends RuntimeException 
{
	String msg;
	public PriceExceedException(String msg)
	{
		super(msg);
		this.msg = msg;		
	}
	
	public String getMsg()
	{
		return msg;
	}
}
