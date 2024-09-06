package com.tvsmotor.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


// @Compoent("veh") // Own name
@Component
public class Vehicle 
{
//	int modelNo;
//	String vehicleName;
	
	@Autowired
	Engine engine;
	
	@Autowired
	Tyre tyre;
	
	public void displayVehicleInfo()
	{
		System.out.println("Vehicle Name");
		engine.displayEngineInfo();
		tyre.noOfTyres = 2;
		tyre.displayTyreInfo();
	}
	
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	

}
