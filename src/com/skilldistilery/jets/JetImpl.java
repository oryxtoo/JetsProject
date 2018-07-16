package com.skilldistilery.jets;

public class JetImpl extends Jet {

	private String model;
	private double speed;
	private int range;
	private long price;
	private String type;

	public JetImpl(String model, double speed, int range, long price, String type) {
		super(model, speed, range, price, type);
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.type = type;
	}

	public double getSpeedInMach(double speed) {
		return super.getSpeedInMach(speed);
	}
	
	public Object fly(Object getJetInfo, double speed, int range) {
		return super.fly(getJetInfo, 0, 0);
	}
	
	public void displayJet() {
	    String jetData = this.toString();
	    System.out.println(jetData);
	  }

	@Override
	public String toString() {
		return "Jet [getJetInfo=" + "model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price
				 + "type=" + type + "]";
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
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
}
