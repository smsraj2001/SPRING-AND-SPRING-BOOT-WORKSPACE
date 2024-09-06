package com.tvsmotor.model;

import org.springframework.stereotype.Component;

@Component
public class Dosa implements BreakFast 
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eating Dosa");
	}

}
