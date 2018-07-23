package com.skilldistilery.jets;

public class CargoPlane extends Jet implements CargoCarrier {
	
	public CargoPlane(String m, double s, int r, long p) {
		super(m, s, r, p);
		CargoCarrier.fly();
	}
	public void loadCargo() {
		System.out.println("Cargo loaded on plane.");
		
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

	
//	public void fly() {//range same as other fly methods
////		
//		}
	}
