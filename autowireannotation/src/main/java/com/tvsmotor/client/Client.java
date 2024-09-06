package com.tvsmotor.client;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.tvsmotor.config.AppConfig;
import com.tvsmotor.model.Tyre;
import com.tvsmotor.model.Vehicle;

public class Client 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		// context.refresh();
		Vehicle vehicle = (Vehicle) context.getBean("vehicle");
		vehicle.displayVehicleInfo();
		vehicle.setTyre((Tyre)context.getBean("tyre"));
		
		context.close();
	}
}
