package com.tvsmotor.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tvsmotor.config.AppConfig;
import com.tvsmotor.exception.PriceExceedException;
import com.tvsmotor.service.ManufacturingPlant;



public class Client {
	public static void main(String[] args) 
	{
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ManufacturingPlant mp = (ManufacturingPlant) context.getBean("mp");
		
		try
		{
			mp.evaluate();
		}
//		catch(PriceExceedException pe)
		catch(Exception pe)
		{
			System.out.println("ERROR: " + pe.getMessage());
		}
		context.close();
	}
}
