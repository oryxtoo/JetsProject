package com.skilldistilery.jets;

public class FighterJet extends Jet implements CombatReady {

	//Jet(String model, double speed, int range, long price, String type) {}	
	public FighterJet(String m, double s, int r, long p, String t) {
		super(m, s, r, p, t);
		CombatReady.fly();	
	}

//----FighterJet Specific Method------------------------------------------------
	public void fight() {
		System.out.println("Dog fight! Pew pew pew pew pew!");	
	}
//Jets have a fly() method that prints out the Jet details and the amount of 
//time the Jet can fly until it runs out of fuel (based on speed and range).
	
//	@Override
//	public Object fly(double speed, int range) {
//		double getRange = speed * range;
//		return super.fly(, getRange, (int) getSpeed());
//	}
	
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