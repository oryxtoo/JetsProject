## Jets Project

* Skill Distillery Week 2 Homework

### Description
Jets is a program that simulates an Airfield Management app.

1) Menu
The user is provided with a menu that displays options.
These options include:

  List Fleet - Lists all planes in the airfield.

  Fly All Jets - Runs the fly() method on each individual plane.

  View Fastest Jet - Displays the fastest plane.

  View Jet With Longest Range - Displays plane with longest flight range.

  Load All Cargo Jets - Runs the loadCargo() method on cargo planes specifically.

  Dogfight! - DOGFIGHT! PEW PEW PEW!

  Add A Jet To Fleet - Adds a user-specified plane to the fleet.

  Quit - Exits program.
------------------------------------------------------------
2) Classes
JetsApp - Provides the main method, the initial implementation of the statistics of the planes in the airfield, and takes user input as needed to interact with the menu options.

AirfieldManager - Instantiates an airfield object to interact with the planes in the airfield, and provides various methods to manipulate those planes.

Airfield - Holds an array of planes to manipulate data of planes as needed, and defines several methods to interact with the array.

Jet - Constructor for individual plane objects. Includes fields for model, speed, range, and price. Defines getter and setter methods, as well as several methods to interact with the objects as needed.

JetImpl - Defines the characteristics required to create a new Jet/Plane object. Implements getter, setter, and several other methods to manipulate plane object data.

FighterJet - EXTENDS Jet, IMPLEMENTS CombatReady - Defines the characteristics of a fighter jet object, as well as defines and overrides methods inherited from the Jet class as needed.

CombatReady - INTERFACE IMPLEMENTED by Jet - Defines the fight() method for jets of the specific "fighter" type.

CargoPlane - EXTENDS Jet, IMPLEMENTS CargoCarrier - Defines the characteristics of a cargo plane object, and defines and overrides methods inherited from the Jet class.

CargoCarrier - INTERFACE IMPLEMENTED by CargoPlane - Defines the loadCargo() method for the specific jet type CargoPlane.
------------------------------------------------------------
3) WISH LIST
My wish list is made up of ideas that I did not implement in the final commit of my project, but wanted to include.

  WEAPONS - Load weapons onto fighter jets, weapons increase damage based on type.

  DOGFIGHT - Implementation of weapons, display of storyline for dogfight, and damage output.

  PILOT - Input or randomize aspects of a pilot, including total flight time, favorite plane, and eventually training hours method.

  HIRE/ASSIGN PILOT - Hire and assign a pilot to a specific plane.

  PILOT BARRACKS - "House" pilots hired by the airfield, and display pilot objects specifications from an array.

  LUXURY JET - Extended class of Jet type that requires "password access" in order to use fly() method.

### Technologies Used
* Java
* Java operators, inheritance, interfaces and abstract classes, inherited methods and overridden methods.


### Lessons Learned

Gained better understanding of methods, classes and objects.
