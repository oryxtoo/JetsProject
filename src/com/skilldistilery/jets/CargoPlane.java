package com.skilldistilery.jets;

public class CargoPlane extends Jet implements CargoCarrier {
	
	public CargoPlane(String m, double s, int r, long p, String t) {
		super(m, s, r, p, t);
		CargoCarrier.fly();
	}
	public void loadCargo() {
		System.out.println("Cargo loaded on plane.");
		
	}
	
	@Override
	public double getSpeedInMach(double speed) {	
		return super.getSpeedInMach(speed);
	}
	
//	@Override
//	public void displayJet() {
//	    String jetData = this.toString();
//	    System.out.println(jetData);
//	  }


	@Override
	public String getModel() {	
		return super.getModel();
	}

	@Override
	public double getSpeed() {	
		return super.getSpeed();
	}

	@Override
	public int getRange() {
		return super.getRange();
	}

	@Override
	public long getPrice() {
		return super.getPrice();
	}
	@Override
	public String getType() {
		return super.getType();
	}
	
	@Override
	public void fly(Jet[] jetArray) {
		for (int i = 0; i < jetArray.length; i++) {
			Jet j = jetArray[i];
			System.out.println("Model: " + j.getModel() + "Speed: " + j.getSpeed() + "Range: "
			+ j.getRange() + "Price: " + j.getPrice() + "Type: " + getType());
			System.out.println("Flight Time: " + (j.getRange() / j.getSpeed()));
		}
	}
}
