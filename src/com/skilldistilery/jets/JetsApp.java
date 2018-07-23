package com.skilldistilery.jets;
import java.util.Scanner;

public class JetsApp {
	public static void main(String[] args) {
		System.out.println("MAIN RUNNING");//working
		JetsApp ja = new JetsApp();
		ja.run();
		
	}

	private void run() {
		Scanner sc = new Scanner(System.in);

		AirfieldManager AFManager = new AirfieldManager();//rename to afmanager

		AFManager.addJetToFleet(new FighterJet("Fairchild Republic A-10 Thunderbolt II", 439, 11000, 18800000));
		AFManager.addJetToFleet(new FighterJet("General Dynamics F-16 Fighting Falcon", 1500, 7000, 18800000));
		AFManager.addJetToFleet(new FighterJet("Lockheed SR-71 Blackbird", 2200, 101972, 34000000));
		AFManager.addJetToFleet(new CargoPlane("Lockheed C-130 Hercules", 368, 60000, 31000000));
		AFManager.addJetToFleet(new CargoPlane("Boeing C-17 Globemaster III ", 517, 171000, 21800000));

		Jet[] allAFManager = AFManager.getAllJets();
		//not sure if 
		String choice;
		//this switch menu IS WORKING/PRINTING
		do { 
			System.out.println("Welcome to JETS");
			System.out.println("1: List Fleet");
			System.out.println("2: Fly All Jets");//LISTS ALL JET STATS
			System.out.println("3: View Fastest Jet");//does nothing >>> FLY METHOD
			System.out.println("4: View Jet With Longest Range");//does nothing >>> FLY METHOD
			System.out.println("5: Load Cargo Planes");//prints CARGO LOADED AS REQUIRED
			System.out.println("6: Dogfight!");//prints DOGFIGHT PEW PEW PEW AS REQUIRED
			// menu[6] = "7: Add Plane To Fleet"; **Stretch Goal** using JetImpl
			// menu[7] = "8: Hire Pilot"; //three random choices
			// menu[8] = "9: Train Pilot"; //hours flying goals
			// menu[9] = "10: Assign Pilot"; //assign pilot to specific plane
			System.out.println("11: Quit Program");
			System.out.println("_______________________");
			System.out.println("Please make a selection: ");
			choice = sc.next();
			
			switch(choice) {
			
				case "1": AFManager.listFleet(); //does NOTHING >>> FLY METHOD
				break;
				case "2": AFManager.fly();//prints entire fleet stats
				break;
				case "3": AFManager.viewFastest();//does nothing >>> FLY METHOD
				break;
				case "4": AFManager.viewRange();//does nothing >>> FLY METHOD
				break;
				case "5": AFManager.loadCargo();// sysout Cargo Loaded!
				break;
				case "6": AFManager.dogFight();//sysout Dogfight! PEW PEW PEW!
				break;
				case "11": AFManager.quitProg();//quit prog
				break;
			}
		} while (!choice.equals("11"));

	sc.close();
	}
}



