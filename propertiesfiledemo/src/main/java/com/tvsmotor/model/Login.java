package com.tvsmotor.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Login 
{
	@Value("${log.name}")
	String name;
	@Value("${log.password}")
	String password;
	
	public void checkUserPassword(String name, String password)
	{
		if(name.equals(this.name) && password.equals(this.password))
		{
			System.out.println("LOGIN SUCCESSFUL !!!");
		}
		else
		{
			System.out.println("INVALID CREDENTIALS !!!");
		}
		
	}

}
