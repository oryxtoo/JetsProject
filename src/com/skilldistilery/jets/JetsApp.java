package com.skilldistilery.jets;

import java.util.Scanner;

public class JetsApp {
	public static void main(String[] args) {
		JetsApp ja = new JetsApp();
		ja.run();
	}

	private void run() {
		Scanner sc = new Scanner(System.in);

		AirfieldManager jets = new AirfieldManager();

		jets.addJetToFleet(new FighterJet("Fairchild Republic A-10 Thunderbolt II", 439, 11000, 18800000, "Fighter"));
		jets.addJetToFleet(new FighterJet("General Dynamics F-16 Fighting Falcon", 1500, 7000, 18800000, "Fighter"));
		jets.addJetToFleet(new FighterJet("Lockheed SR-71 Blackbird", 2200, 101972, 34000000, "Fighter"));
		jets.addJetToFleet(new CargoPlane("Lockheed C-130 Hercules", 368, 60000, 31000000, "Cargo"));
		jets.addJetToFleet(new CargoPlane("Boeing C-17 Globemaster III ", 517, 171000, 21800000, "Cargo"));

//		Jet[] allJets = jets.getAllJets();

		do {
			System.out.println("Welcome to __________");
			System.out.println("1: List Fleet");
			System.out.println("2: Fly All Jets");
			System.out.println("3: View Fastest Jet");
			System.out.println("4: View Jet With Longest Range");
			System.out.println("5: Load Cargo Planes");
			System.out.println("6: Dogfight!");
			// menu[6] = "7: Add Plane To Fleet"; **Stretch Goal** using JetImpl
			// menu[7] = "8: Hire Pilot"; //three random choices
			// menu[8] = "9: Train Pilot"; //hours flying goals
			// menu[9] = "10: Assign Pilot"; //assign pilot to specific plane
			System.out.println("11: Quit Program");
			System.out.println("_______________________");
			System.out.println("Please make a selection: ");
			String choice = sc.next();

			switch(choice) {
			
				case "1": jets.listFleet();
				break;
				case "2": jets.fly();
				break;
				case "3": jets.viewFastest();
				break;
				case "4": jets.viewRange();
				break;
				case "5": jets.loadCargo();
				break;
				case "6": jets.dogFight();
				break;
				case "11": jets.quitProg();
				break;
			}
		} while (!choice.equals("11"));
	

	System.out.println("Please choose a menu option: ");

	String choice = sc.next();

	sc.close();
	}
}



