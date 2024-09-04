package com.tvsmotor.client;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.tvsmotor.service.Restaurant;

public class RestaurantClient {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("objects.xml");
		
		// This is IOC.
		BeanFactory factory = new XmlBeanFactory(resource);
		Restaurant restaurant = (Restaurant) factory.getBean("r");
		
		restaurant.restaurantName();
		restaurant.restaurantDetails();
	}

}
