
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
	
	
	
}
