package com.skilldistilery.jets;

public class AirField {

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
		return jetCopy; 
	}
}
