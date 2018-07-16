package com.skilldistilery.jets;
import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	
	public void displayUserMenu(String[] choices) {
		System.out.println("Welcome to __________");
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
		System.out.println("_______________________");
		System.out.println(menu);
		String choice = sc.next();
		
		do {
		for (int i = 0; i < menu.length; i++) {
			
			
			if (choice.equals("2")) { //fly all jets
				fly();
			}
		}
		
		}
		while(!choice.equals("11"));
		}			
	}




	
	

