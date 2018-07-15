public class AirField {
	//private Jet jets[];???
	//private Pilot autoPilot;
	//private int currentJetIndex;
	
	private Jet[] jets = new Jet[200]; //create jet array
	//add jets to array (5)
//	private Jet[] jets;
	  private int numJets = 0;
	  
	  final private static int MAX_JETS = 200;
  
	  public AirField() {
	    jets = new Jet[MAX_JETS];
	  }
	  public void addJet(Jet a) {
	    jets[numJets] = a;
	    numJets++;    // increment to reflect that we have one more jet
	  }
	  
	  public Jet[] getJets() {
	    Jet[] jetCopy;
	    jetCopy = new Jet[numJets];
	    for(int i=0; i < numJets; i++) {
	      jetCopy[i] = jets[i];
	    }
	    
	    return jetCopy;
	  }
	
	
	
//On program startup, populate the AirField with at least 5 Jets of different types.
//The array must have extra space for adding Jets.	
	
//---------instance initializer----------------------------------------------
	{		
		 jets = new Jet[200];
		 //pilot = new Pilot();
	}
//----------------------------------------------------------------------------	
//add jets (and pilot???) to array
//public AirField(Jet[] jets /*Pilot autoPilot in seperate array?*/) {}
//	public void addJet(Jet jets) {
//		for (int i = 0; i < this.jets.length; i++) {
//			if (this.jets[i] == null) {
//				this.jets[i] = jets;
//				break;
//			}
}		
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