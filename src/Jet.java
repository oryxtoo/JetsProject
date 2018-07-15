public abstract class Jet {
	
private String model;
private double speed; //mph and/or mach
private int range;
private long price;
//You are going to create a fleet of jets with different capabilities. 
//Your application will be a menu to use your jets and access information about 
//them.
//----constructors--------------------------------------------------------------

public Jet(String m, double s, int r, long p) {
    super();
    model = m;
    speed = s;
    range = r;
    price = p;
  }

private Object getJetInfo;

//menu()

//As you work through the user stories think about what classes you will need 
//before your start writing code. (String, double, int, long)

//Structure
//All Jets must have a model, speed, range, and price associated with them. 
//Speed is in MPH, but your Jet can also output the speed in mach.

//Jets have a fly() method that prints out the Jet details and the amount of 
//time the Jet can fly until it runs out of fuel (based on speed and range).
//---------methods--------------------------------------------
//prints jet details and flight range/time
	public double getSpeedInMach(double speed) {
		
		
		return speed;
		}
//print Jet details and fly time for fuel based on speed/range 
	Object getJetInfo(String m, double s, int r, long p) {
		Object info = getJetInfo;
		System.out.println("Model: " + m + " Speed: " + s + " Range: " + r + "Price: " + p);
		return info;
	}
//***toString method?
	
	public void fly(Object getJetInfo, double getSpeedInMach) {
		System.out.println(getJetInfo + getSpeedInMach);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Jet [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + ", getJetInfo="
				+ getJetInfo + "]";
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the speed
	 */
	public double getSpeed() {
		return speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	/**
	 * @return the range
	 */
	public int getRange() {
		return range;
	}
	/**
	 * @param range the range to set
	 */
	public void setRange(int range) {
		this.range = range;
	}
	/**
	 * @return the price
	 */
	public long getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(long price) {
		this.price = price;
	}
//----------toString method and displayJetInfo methods--------------------------	
//	public String toString() {
//	    String output = "make=" + make + ", model=" + model + ", color=" + color + ", numberOfWheels=" + numberOfWheels
//	        + ", purchasePrice=" + purchasePrice;
//	    return output;
//	  }
//
//	  public void displayCar() {
//	    String carData = this.toString();
//	    System.out.println(carData);
//	  }
//	}
	
	
	
	
}
//	public class Animal {
//
//		private String firstName;
//
//		public Animal() {
//			
//		}
//		
//		public Animal(String firstName) {
//			this.firstName = firstName;
//		}
//		
//		@Override
//		public String toString() {
//			return "Animal [firstName=" + firstName + "]";
//		}
//
//		public String getFirstName() {
//			return firstName;
//		}
//
//		public void setFirstName(String firstName) {
//			this.firstName = firstName;
//		}
//		
//		public void eat(int food) {
//			System.out.println("The " + firstName + " ate " + food);
//		}
//		
//		public void makeNoise() {
//			System.out.println("The " + firstName + " made noise.");
//		}
//	}

