package com.tvsmotor.client;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.tvsmotor.config.AppConfig;
import com.tvsmotor.service.VehicleDetailsService;

public class Client 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		VehicleDetailsService vehicleds = (VehicleDetailsService) context.getBean("vehicleDetailsService");
		vehicleds.showVehicleInfo();
		context.close();
	}
}
