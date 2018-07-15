import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);

	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	//if loop???
	//*****Note: these methods must search the collection of jets to find the 
	//appropriate jet.*****
	
//The user is presented with an option specific to the interfaces you created. 
//For example, Load all Cargo Jets finds all implementors of the CargoCarrier 
//interface and calls loadCargo() on each. (Note that the menu text is italicized 
//because yours may be different.)

	//A user can add custom jets to the fleet. This can be a JetImpl.
	//***Stretch Goal***:This leads to a sub-menu where the user chooses the type of Jet.
	//Users then enter information for the Jet, and it is added to the AirField.

//(There must be at least 5 jets stored when the program starts).
	public void printMenu(String[] choices) {
		// get array of choices	
		System.out.println("Welcome to _________");
		String[] menu = new String[10];
		menu[0] = "List Fleet";
		menu[1] = "Fly All Jets";
		menu[2] = "View Fastest Jet";
		menu[3] = "View Jet With Longest Range";
		menu[4] = "Load Cargo Planes";
		menu[5] = "Dogfight!";
		menu[6] = "Add Plane To Fleet";
		menu[7] = "Hire Pilot"; //three random choices
		menu[8] = "Train Pilot"; //hours flying goals
		menu[9] = "Assign Pilot"; //assign pilot to specific plane
		menu[10] = "Quit Program";
		
		int choice = sc.nextInt();
		
//		for (int i = 0; i < menu.length; i++) {
//			System.out.println(menu[i] + choices[i]);
		if 
			
	}	
}



	
	

