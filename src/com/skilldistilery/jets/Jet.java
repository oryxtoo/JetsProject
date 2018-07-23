package com.skilldistilery.jets;

public abstract class Jet {
	
private String model;
private double speed; //mph and/or mach
private int range;
private long price;
//private String type;



//----constructors--------------------------------------------------------------

public Jet(String m, double s, int r, long p) {
    this.model = m;
    this.speed = s;
    this.range = r;
    this.price = p;
//    this.type = t;
  }

//---------methods--------------------------------------------

//	public Jet createJet() {
//		Jet j = new Jet(model, speed, range, price);
//		return j;
//	
//}
	public double getSpeedInMach(double speed) {
		//if (type == "Fighter") {
		double mach = 0.001303;
		double speedInMach = (speed * mach);	
		return speedInMach;
		}
	
	public void fly() { 
		//for one jet
		System.out.println( this.model + " is flying.");
		//range/speed = time
		double time = range/speed;
		System.out.println("Flight time: " + time);
	}
	
//------Getters & Setters--------------------------------------------------------

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
//	public String getType() {
//		return type;
//	}
//	public void setType(String type) {
//		this.type = type;
//	}
	public String toString() {
		return "Jet [model=" + model + ", speed=" + speed + ", range=" + 
	range + ", price=" + price + "type=" + "]";
	}


	}
	



