package com.skilldistilery.jets;

public abstract class Jet {
	
private String model;
private double speed; //mph and/or mach
private int range;
private long price;
private String type;
}
//----constructors--------------------------------------------------------------

public Jet(String m, double s, int r, long p, String t) {
    super();
    model = m;
    speed = s;
    range = r;
    price = p;
    type = t;
  }

//---------methods--------------------------------------------

	public Jet() {
	
}
	public double getSpeedInMach(double speed) {
		//if (type == "Fighter") {
		double mach = 0.001303;
		double speedInMach = (speed * mach);	
		return speedInMach;
		}
	
	Object getJetInfo(String m, double s, int r, long p, String type) {
		Object info = getJetInfo(null, 0, 0, 0, null);
		System.out.println(info);
		return info;
	}
	
	public Object fly(Object getJetInfo, double speed, int range) {
		return fly(getJetInfo, speed, range);
	}
	
	public void displayJet() {
	    String jetData = this.toString();
	    System.out.println(jetData);
	  }
	
	public String toString() {
		return "Jet [model=" + model + ", speed=" + speed + ", range=" + 
	range + ", price=" + price + "type=" + type + "]";
	}
//	private void printJets(Jet[] jets) {
//	    for (Jet jet : jets) {
//	      jet.displayJet();
//	    }
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}		



