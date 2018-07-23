package com.skilldistilery.jets;

public class JetImpl extends Jet {

	private String model;
	private double speed;
	private int range;
	private long price;
	

	public JetImpl(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;

	}

	public double getSpeedInMach(double speed) {
		return super.getSpeedInMach(speed);
	}
	
	public void displayJet() {
	    String jetData = this.toString();
	    System.out.println(jetData);
	  }

	@Override
	public String toString() {
		return "Jet [getJetInfo=" + "model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price
				 + "]";
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

}
