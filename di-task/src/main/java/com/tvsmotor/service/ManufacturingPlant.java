package com.tvsmotor.service;

import com.tvsmotor.exception.PriceExceedException;

public class ManufacturingPlant {
	int totalPrice;
	AssemblyDepartment ad;
	EngineDepartment ed;
	QualityDepartment qd;
	

	public ManufacturingPlant(int totalPrice, AssemblyDepartment ad, EngineDepartment ed, QualityDepartment qd) {
		super();
		this.totalPrice = totalPrice;
		this.ad = ad;
		this.ed = ed;
		this.qd = qd;
	}
	
	public ManufacturingPlant(AssemblyDepartment ad, EngineDepartment ed, QualityDepartment qd) {
		super();
		this.ad = ad;
		this.ed = ed;
		this.qd = qd;
	}

	public void setAd(AssemblyDepartment ad) {
		this.ad = ad;
	}
	public void setEd(EngineDepartment ed) {
		this.ed = ed;
	}
	public void setQd(QualityDepartment qd) {
		this.qd = qd;
	}
	
	public void evaluate() throws PriceExceedException
	{
			totalPrice = ad.price + ed.price + qd.price;
			
			if(totalPrice <= 50000)
			{
				System.out.println("Your price approved!!!\nFor INR " + totalPrice);
			}
			else
			{
				throw new PriceExceedException("Your cohort price exceeds INR 50000");
			}	
	}
}
