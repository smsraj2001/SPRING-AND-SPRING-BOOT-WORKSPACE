package com.tvsmotor.client;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.tvsmotor.config.AppConfig;
import com.tvsmotor.model.Vehicle;

public class Client 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		// context.refresh();
		Vehicle vehicle1 = (Vehicle) context.getBean("vehicle");
		Vehicle vehicle2 = (Vehicle) context.getBean("vehicle");
		Vehicle vehicle3 = (Vehicle) context.getBean("vehicle");
		
		System.out.println(vehicle1.hashCode());
		System.out.println(vehicle2.hashCode());
		System.out.println(vehicle3.hashCode());
		
		vehicle1.setName("apache");
		vehicle2.setName("ntorq");
		vehicle3.setName("jupiter");
		
		vehicle1.displayVehicleInfo();
		vehicle2.displayVehicleInfo();
		vehicle3.displayVehicleInfo();
		
		context.close();
	}
}
