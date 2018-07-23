package com.skilldistilery.jets;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String m, double s, int r, long p) {
		super(m, s, r, p );
		CombatReady.fly();	
	}

//----FighterJet Specific Method------------------------------------------------
	public void fight(Jet jet) {
		System.out.println("Dog fight! Pew pew pew pew pew!");	
	}
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
	public void fight() {
		// TODO Auto-generated method stub
		
	}
}