package com.skilldistilery.jets;

import java.util.Scanner;

public class JetsApp {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		  /* CONSTRUCTOR*/ JetsApp ja = new JetsApp();
			ja.run();
		//instantiate variables here?
	}
	private void run() {
		Scanner sc = new Scanner(System.in);
		
		displayUserMenu();
		
		System.out.println("Please choose a menu option: ");
		String choice = sc.next();
		
		getJets();
//		jets.addJetToFleet(new Jet("Fairchild Republic A-10 Thunderbolt II", 439, 11000, 18800000, "Fighter"));
//	    jets.addJetToFleet(new Jet("General Dynamics F-16 Fighting Falcon", 1500, 7000, 18800000, "Fighter"));
//	    jets.addJetToFleet(new Jet("Lockheed SR-71 Blackbird", 2200, 101972, 34000000, "Fighter"));
//	    jets.addJetToFleet(new Jet("Lockheed C-130 Hercules", 368, 60000, 31000000, "Cargo"));
//	    jets.addJetToFleet(new Jet("Boeing C-17 Globemaster III ", 517, 171000, 21800000, "Cargo"));
//		
		//displayUserMenu();	
	
//	}
//private void displayUserMenu() {
//		
//		
//	}
//-------METHODS-----------------------------------------------------------------
	public Jet[] getJets() {
		JetsApp afTwo = null;
		Jet[] newJets = afTwo.getJets();
		// return a copy of the array so that callers cannot modify repository data
		Jet[] allJets = new Jet[newJets.length];
		for (int i = 0; i < newJets.length; i++) {
			allJets[i] = newJets[i];
		}
		return allJets;
	}
}

//	for (Jet jets : FighterJet) {
//	      double speed = getSpeedInMach(jets);
//	      if(jets instanceof Jet) {
//	        Jet plane = (Jet) jets;
//	        System.out.print(plane.getSpeedInMach(speed) + " " + plane.getModel() + "\t");
//	      }
//	      else if(jets instanceof CargoPlane) {}

// private pilot(){}

//
//	}

//}
//	public class VehicleApp {
//		  public static void main(String[] args) {
//		     VehicleApp va = new VehicleApp();
//		     va.run();
//		  }
//
//		  public void run() {
//		    Automobile a = new Automobile(90000.00, "Dundreary", "Stretch", 2008, 4, 105);
//		    Boat b = new Boat(145000.00, "Reefer", 21, 25);
//		    Truck t = new Truck(22_000, "Vapid", "Bobcat", 2006, 4, 88, 55);
//		    // Can use a vehicle reference, too
//		    Vehicle a2 = new Automobile(97000.00, "Albany", "Hermes", 1942, 4, 176);
//		    Vehicle bigTruck = new Truck(120000.00, "MTL", "Packer", 2005, 10, 85, 139);
//		    
//		    Vehicle[] vehicles = new Vehicle[5];
//		    vehicles[0] = a;
//		    vehicles[1] = b;
//		    vehicles[2] = t;
//		    vehicles[3] = a2;
//		    vehicles[4] = bigTruck;
//		    
//		    for (Vehicle vehicle : vehicles) {
//		      double regFee = calculateVehicleRegistration(vehicle);
//		      if(vehicle instanceof Automobile) {
//		        Automobile auto = (Automobile) vehicle;
//		        System.out.print(auto.getMake() + " " + auto.getModel() + "\t");
//		      }
//		      else if(vehicle instanceof Boat) {
//		        int length = ((Boat) vehicle).getLengthInFeet();
//		        System.out.printf("%d ft\t", length  );
//		      }
//		      System.out.printf("$%.2f\t fee: $%.2f%n", vehicle.getPurchasePrice(), regFee);
//		    }
//		  }
//
//		  private double calculateVehicleRegistration(Vehicle v) {
//		    double rate = 0.02;
//		    if(v instanceof Automobile) { // Truck is-a Automobile
//		      rate = 0.04;
//		    }
//		    else if(v instanceof Boat) {
//		      rate = 0.065;
//		    }
//		    return v.calculateRegistrationFee(rate);
//		  }
//		}

//--------------------------------------------------------------
//	Car car1 = new Car("Black", "Dodge", "Stratus", 4, 15412.0);
//
//    Car car2 = new Car();
//    car2.setColor("Neon");
//    car2.setMake("Ford");
//    car2.setModel("F950");
//    car2.setNumberOfWheels(10);
//    car2.setPurchasePrice(74999.0);
//
//    // Have the cars display themselves
//    car1.displayCar();
//    car2.displayCar();
//
//    String car1Data = car1.toString();
//    String car2Data = car2.toString();
//
//    // Get the cars' data and display that
//    System.out.println("Car 1 data: " + car1Data);
//    System.out.println("Car 2 data: " + car2Data);
//  }
//	
//	

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
