package com.skilldistilery.jets;

public class AirField extends Jet {

	private Jet[] jets;
	private int numJets = 0;

	final private static int MAX_JETS = 200;

	public AirField() {
		jets = new Jet[MAX_JETS]; //create jets array with 200
	}

	public void addJet(Jet a) {
		jets[numJets] = a;
		numJets++; // increment to reflect that we have one more jet
	}

	public Jet[] getJets() {
		Jet[] jetCopy;
		jetCopy = new Jet[numJets];
		for (int i = 0; i < numJets; i++) {
			jetCopy[i] = jets[i];
		}
		return jetCopy; // where is this returning?
	}
//
//	public Jet[] findJetByType(String type) {
//		Jet[] jetByType = null;
//		Jet[] jets = afOne.getJets();
//		return jetByType;
//	}

//	private void printJets(Jet[] jets) {
//		for (Jet jet : jets) {
//			jet.displayJet();
//		}
	
	}

//On program startup, populate the AirField with at least 5 Jets of different types.
//The array must have extra space for adding Jets.	

//---------instance initializer----------------------------------------------
//	{
//		jets = new Jet[200];
//		// pilot = new Pilot();
//	}
//----------------------------------------------------------------------------	
//	jets.addJetToFleet(new Jet("Fairchild Republic A-10 Thunderbolt II", 439, 11000, 18800000, "Fighter"));
//    jets.addJetToFleet(new Jet("General Dynamics F-16 Fighting Falcon", 1500, 7000, 18800000, "Fighter"));
//    jets.addJetToFleet(new Jet("Lockheed SR-71 Blackbird", 2200, 101972, 34000000, "Fighter"));
//    jets.addJetToFleet(new Jet("Lockheed C-130 Hercules", 368, 60000, 31000000, "Cargo"));
//    jets.addJetToFleet(new Jet("Boeing C-17 Globemaster III ", 517, 171000, 21800000, "Cargo"));
//-----------------------------------------------------------------------------
//    jets.fly();
//    jets.fight();
//    jets.loadCargo();

//    public void printJets(jets[]) {
//    }

//    System.out.println("Total jets returned: " + jets.length);
//  }

//  public class ParkingLotTester {
//
//	  public static void main(String[] args) {
//	    ParkingLotTester crt = new ParkingLotTester();
//	    crt.run();
//	  }
//	  
//	  private void run() {
//	    ParkingLot cr = new ParkingLot();
//	    
//	    Car[] cars = cr.getCars();
//	    
//	    System.out.println("Number of initial cars: " + cars.length);
//	    
//	    Car car1 = new Car("Black", "Dodge", "Stratus", 4, 15412.0);
//
//	    Car car2 = new Car();
//	    car2.setColor("Neon");
//	    car2.setMake("Ford");
//	    car2.setModel("F950");
//	    car2.setNumberOfWheels(10);
//	    car2.setPurchasePrice(74999.0);
//	    
//	    cr.addCar(car1);
//	    cr.addCar(car2);
//	    
//	    // Get the car array
//	    cars = cr.getCars();    

//add jets (and pilot???) to array
//public AirField(Jet[] jets /*Pilot autoPilot in seperate array?*/) {}
//	public void addJet(Jet jets) {
//		for (int i = 0; i < this.jets.length; i++) {
//			if (this.jets[i] == null) {
//				this.jets[i] = jets;
//				break;
//			}

//public class ParkingLot {
//	  private Car[] cars;
//	  private int numCars = 0;
//	  
//	  final private static int MAX_CARS = 100;
//	  
//	  public ParkingLot() {
//	    cars = new Car[MAX_CARS];
//	  }
//	  public void addCar(Car c) {
//	    cars[numCars] = c;
//	    numCars++;    // increment to reflect that we have one more car
//	  }
//	  
//	  public Car[] getCars() {
//	    Car[] carCopy;
//	    carCopy = new Car[numCars];
//	    for(int i=0; i < numCars; i++) {
//	      carCopy[i] = cars[i];
//	    }
//	    
//	    return carCopy;
//	  }
//	}
//--------------------------------------------------------------------------

//public void startAttendantRounds() {
//	attendant.doRounds(animals);
//}
//--------------------------------------------------------------------------
//Loop through the array and call each PopStar's sing() method
//for (int i = 0; i < stars.length; i++) {
//  PopStar popStar = stars[i];
//  popStar.sing();
//}

//
//public static void printBands(String[][] bands) {
//    for (String[] band : bands) {
//      for (String member : band) {
//        System.out.print(member + " ");
//      }
//      System.out.println();
//    }
//  }

//public static void printBoard(char[][] charArr) {
//    for(int row=0; row < charArr.length; row++) {
//      for(int col=0; col < charArr[row].length; col++) {
//        System.out.print(charArr[row][col]);
//      }
//      System.out.println();
//    }
//  }
//
//public class CarDealershipManager {
//	  
//	  private ParkingLot repo;
//	  
//	  {
//	    repo = new ParkingLot();
//	  }
//
//	  public void addCarToInventory(Car car) {
//	    repo.addCar(car);
//	  }
//	  
//	  public Car[] findCarsByModel(String model) {
//	    Car[] carsByModel = null;
//	    Car[] cars = repo.getCars();
//	    
//	    // Find out how big the array should be by using a boolean
//	    // array and marking the index to true if the model matches,
//	    // and adding to the total of matches.
//	    // We use this array to avoid iterating through the cars array
//	    // and calling .equals() on all the models a second time.
//	    boolean[] matchingIndexes = new boolean[cars.length];
//	    int numMatchingIndexes = 0;
//	    for (int i = 0; i < cars.length; i++) {
//	      // check the String input against the car's model
//	      if(model.equals(cars[i].getModel())) {
//	        matchingIndexes[i] = true;
//	        numMatchingIndexes++;
//	      }
//	    }
//	    
//	    // now loop through to see which indexes match
//	    // use a separate counter to keep track of which carsByModel
//	    // index we are on
//	    carsByModel = new Car[numMatchingIndexes];
//	    int carsByModelCounter = 0;
//	    for (int i = 0; i < matchingIndexes.length; i++) {
//	      if(matchingIndexes[i]) {
//	        carsByModel[carsByModelCounter] = cars[i];
//	        carsByModelCounter++;
//	      }
//	    }
//	    
//	    return carsByModel;
//	  }
//	  
//	  public Car[] getAllCars() {
//	    Car[] repoCars = repo.getCars();
//	    // return a copy of the array so that callers cannot modify repository data
//	    Car[] allCars = new Car[repoCars.length];
//	    for (int i = 0; i < repoCars.length; i++) {
//	      allCars[i] = repoCars[i];
//	    }
//	    
//	    return allCars;
//	  }