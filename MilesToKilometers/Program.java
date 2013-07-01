package com.spconger.MilesToKilometers;
import acm.program.*;
import acm.graphics.*;
import acm.io.IODialog;;

@SuppressWarnings("serial")
public class Program extends GraphicsProgram{
	
	public void run(){
		setSize(400,500);
		IODialog dialog = new IODialog();
		double miles = dialog.readDouble("Please enter the miles");
		MilesToKilometersConversion  mToK=
				new MilesToKilometersConversion(miles);
		mToK.convertToKilometers();
		GLabel label=new GLabel(miles +
				" equals  " +mToK.getKilometers()
				+ " Kilometers", 50,60);
		add(label);
	}
}
