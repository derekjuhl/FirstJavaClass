package com.spconger.MilesToKilometers;

public class MilesToKilometersConversion {
	
	private double miles;
	private double kilometers;
	private final double CONVERSIONFACTOR=1.6;
	
	public MilesToKilometersConversion(){
		setMiles(0);
		setKilometers(0);
	}
	
	public MilesToKilometersConversion(double miles){
		setMiles(miles);
		setKilometers(0);
	}

	public double getMiles() {
		return miles;
	}

	public void setMiles(double miles) {
		this.miles = miles;
	}

	public double getKilometers() {
		return kilometers;
	}

	public void setKilometers(double kilometers) {
		this.kilometers = kilometers;
	}
	
	public void convertToKilometers(){
			setKilometers(getMiles() * CONVERSIONFACTOR);
	}

}


