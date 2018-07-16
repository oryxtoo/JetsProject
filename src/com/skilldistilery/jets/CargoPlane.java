package com.skilldistilery.jets;

public class CargoPlane extends Jet implements CargoCarrier {
	
	public CargoPlane(String m, double s, int r, long p, String t) {
		super(m, s, r, p, t);
		this.fly(getJetInfo(m, s, r, p, t), s, r);
	}
	//Jet(String model, double speed, int range, long price) {}
	//Jets have a fly() method that prints out the Jet details and the amount of 
	//time the Jet can fly until it runs out of fuel (based on speed and range).
	
	public void loadCargo() {
		System.out.println("Cargo loaded on plane.");
		
	}
	@Override
	public Object fly(Object getJetInfo, double speed, int range) {
		double getRange = speed * range;
		return super.fly(getJetInfo, getRange, (int) getSpeed());
	}
	
	@Override
	public double getSpeedInMach(double speed) {	
		return super.getSpeedInMach(speed);
	}

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
}
