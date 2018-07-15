import java.util.Scanner;

public class JetsApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	private void airField() {
	}
	//private pilot(){}
	
//----Create New Jets App Instance, create Airfield and Pilot in it------------
		JetsApp sim = new JetsApp();
		sim.run();
		
		 void run(){
			    Account acc1 = new Account("ACC-10001", 305.32);
			    Account acc2 = new Account("ACC-10002", 9053.23);
			    
			    printAccountData(acc1);
			    printAccountData(acc2); 
			  }
			  
			  void printAccountData(Account account) {
			    System.out.println(account.accountId + " balance: " + account.balance);
			  }
	
	public JetsApp() {
		//pilot = new Pilot();
		airField = new AirField(Jet[]/*pilot*/);
		addJet
		
	public JetsApp(sim) {
		
	}
	
	private void launch() {
		
	}
	
	private void displayUserMenu() {
		
	}
	
//	public class BankApp {
//
//		  public static void main(String[] args) {
//		    BankApp/*<-constructor*/ b = new BankApp();
//
//		    b.run();
//		  }
//		  
//		  void run(){
//		    Account acc1 = new Account("ACC-10001", 305.32);
//		    Account acc2 = new Account("ACC-10002", 9053.23);
//		    
//		    printAccountData(acc1);
//		    printAccountData(acc2); 
//		  }
//		  
//		  void printAccountData(Account account) {
//		    System.out.println(account.accountId + " balance: " + account.balance);
//		  }
//	}
	
	
	
	private void run() {
		airField.addJet(new FighterJet("Fairchild Republic A-10 Thunderbolt II"));
		airField.addJet(new FighterJet("General Dynamics F-16 Fighting Falcon"));
		airField.addJet(new FighterJet("Lockheed SR-71 Blackbird"));
		airField.addJet(new CargoPlane("Lockheed C-130 Hercules"));
		airField.addJet(new CargoPlane("Boeing C-17 Globemaster III "));
		
		airField.();
	
	
	}

}

//private Attendant attendant;
//private Sanctuary sanc;
//
//	
	
//	public static void main(String[] args) {
//		SanctuarySimulator sim = new SanctuarySimulator();
//		sim.run();
//	}
//	public SanctuarySimulator() {
//		attendant = new Attendant();
//		sanc = new Sanctuary(attendant);
//	}
//	private void run() {
//		sanc.addAnimal(new Giraffe("Jeffery"));
//		sanc.addAnimal(new Lion("Mufasa"));
//		sanc.addAnimal(new Elephant("Dumbo"));
//		sanc.addAnimal(new Hippo("Barney"));
//		
//		sanc.startAttendantRounds();
//		
//		
//	}
//}

