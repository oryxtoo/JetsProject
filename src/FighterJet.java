
public class FighterJet extends Jet {

	//Jet(String model, double speed, int range, long price) {}	

	
	public FighterJet(String m, double s, int r, long p) {
		super(m, s, r, p);
		// TODO Auto-generated constructor stub
	}

//----FighterJet Specific Method------------------------------------------------
	public void fight() {
		
		//what fight does
	}
//Jets have a fly() method that prints out the Jet details and the amount of 
//time the Jet can fly until it runs out of fuel (based on speed and range).
	/* (non-Javadoc)
	 * @see Jet#getSpeedInMach(double)
	 */
	
	@Override
	public void fly(Object getJetInfo, double getSpeedInMach) {
		// TODO Auto-generated method stub
		super.fly(getJetInfo, getSpeedInMach);
	}
	
	@Override
	public double getSpeedInMach(double speed) {
		// TODO Auto-generated method stub
		return super.getSpeedInMach(speed);
	}

	/* (non-Javadoc)
	 * @see Jet#fly(java.lang.Object, double)
	 */
	
	/* (non-Javadoc)
	 * @see Jet#getModel()
	 */
	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return super.getModel();
	}

	/* (non-Javadoc)
	 * @see Jet#getSpeed()
	 */
	@Override
	public double getSpeed() {
		// TODO Auto-generated method stub
		return super.getSpeed();
	}

	/* (non-Javadoc)
	 * @see Jet#getRange()
	 */
	@Override
	public int getRange() {
		// TODO Auto-generated method stub
		return super.getRange();
	}

	/* (non-Javadoc)
	 * @see Jet#getPrice()
	 */
	@Override
	public long getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice();
	}	
//	Concrete subclasses of an abstract class must implement (provide code for) 
	//its abstract methods.
	
	
	
//	public String toString() {
//		return "Herbivore =" + getFirstName();
//	}
	
//	@Override
//	public void eat(int food) {
//		
//	}
//	
	
//	A subclass inherits the methods of its superclass and can choose which 
	//methods to override.
	
//	public class Light {
//	  public void changeBulb() {
//	    // subclasses should override this method
//	  }
//	}
//	class HalogenLight1 extends Light {
//	  // no override.
//--------------------------------------------------
//public class Herbivore extends Animal {
//	
//	public Herbivore() {
//		
//	}
//	
//	public Herbivore(String firstName) {
//		super(firstName);
//	}
//
//	@Override
//	public String toString() {
//		return "Herbivore =" + getFirstName();
//	}
//	
//	
//}
