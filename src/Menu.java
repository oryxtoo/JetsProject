import java.util.Scanner;

public class Menu extends JetsApp{
	Scanner sc = new Scanner(System.in);

	public Menu() {
		super();	
	}
	//if loop???
	//*****Note: these methods must search the collection of jets to find the 
	//appropriate jet.*****

	public Menu(String[] choices) {
		// get array of choices	
		System.out.println("Welcome to _________");
		String[] menu = new String[10];
		menu[0] = "1: List Fleet";
		menu[1] = "2: Fly All Jets";
		menu[2] = "3: View Fastest Jet";
		menu[3] = "4: View Jet With Longest Range";
		menu[4] = "5: Load Cargo Planes";
		menu[5] = "6: Dogfight!";
		//menu[6] = "7: Add Plane To Fleet"; **Stretch Goal** using JetImpl
		//menu[7] = "8: Hire Pilot"; //three random choices
		//menu[8] = "9: Train Pilot"; //hours flying goals
		//menu[9] = "10: Assign Pilot"; //assign pilot to specific plane
		menu[10] = "11: Quit Program";
		System.out.println(menu);
		String choice = sc.next();
		
//		for (int i = 0; i < menu.length; i++) {
//			System.out.println(menu[i] + choices[i]);
		if (choice.equals("1")) { //list fleet
			getJets();
		}
		if (choice.equals("2")) { //fly all jets
			//fly();
		}
		if (choice.equals("3")) { //view fastest jet
			
		}
		if (choice.equals("4")) { //view jet w/longest range
			
		}
		if (choice.equals("5")) { //load cargo planes
			 //Load all Cargo Jets finds all implementors of the CargoCarrier 
			//interface and calls loadCargo() on each
			//loadCargo();
		}
		if (choice.equals("6")) { //dogfight
			//fight();
		}
		//if (choice.equals("7")) { //add plane
			//addJet(); Submenu
		//}
		//if (choice.equals("8")) { //hire pilot
			//hire();
		//}
		//if (choice.equals("9")) { //train pilot
			//train();
		//}
		//if (choice.equals("10")) { //assign pilot
			//assign();
		//}
		if (choice.equals("11")) { //quit
			//exit
		}			
	}	
}


	
	

