package com.tvsmotor.config;

import org.springframework.context.annotation.Bean;

import com.tvsmotor.service.AssemblyDepartment;
import com.tvsmotor.service.EngineDepartment;
import com.tvsmotor.service.ManufacturingPlant;
import com.tvsmotor.service.QualityDepartment;

public class AppConfig {
	
	@Bean(name = "ad")
	public AssemblyDepartment getAssemblyDepartment()
	{
		return new AssemblyDepartment(20000);
	}
	
	@Bean(name = "ed")
	public EngineDepartment getEngineDepartment()
	{
		return new EngineDepartment(20000);
	}
	
	@Bean(name = "qd")
	public QualityDepartment getQualityDepartment()
	{
		return new QualityDepartment(20000);
	}
	
	@Bean(name = "mp")
	public ManufacturingPlant createManufacturingPlantInstance()
	{
		return new ManufacturingPlant(getAssemblyDepartment(), getEngineDepartment(), getQualityDepartment());
		
	}

}
