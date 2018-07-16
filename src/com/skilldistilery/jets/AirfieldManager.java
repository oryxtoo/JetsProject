package com.skilldistilery.jets;

public class AirfieldManager {
	private AirField afOne;

	{
		afOne = new AirField();
	}

	public void addJetToFleet(Jet jet) {
		afOne.addJet(jet);
	}

	public Jet[] findJetsByModel(String model) {
		Jet[] jetsByModel = null;
		Jet[] jets = afOne.getJets();

		boolean[] indexes = new boolean[jets.length];
		int numMatchingIndexes = 0;
		for (int i = 0; i < jets.length; i++) {
			// check the String input against the jet's model
			if (model.equals(jets[i].getModel())) {
				indexes[i] = true;
				numMatchingIndexes++;
				// check the String input against the jet's model
				if (model.equals(jets[i].getModel())) {
					indexes[i] = true;
					numMatchingIndexes++;
				}
			}
		}
		// now loop through to see which indexes match
		// use a separate counter to keep track of which carsByModel
		// index we are on
		jetsByModel = new Jet[numMatchingIndexes];
		int jetsByModelCounter = 0;
		for (int i = 0; i < indexes.length; i++) {
			if (indexes[i]) {
				jetsByModel[jetsByModelCounter] = jets[i];
				jetsByModelCounter++;
			}
		}

		return jetsByModel;
	}

	public Jet[] getAllJets() {
		Jet[] afOneJets = afOne.getJets();
		// return a copy of the array so that callers cannot modify repository data
		Jet[] allJets = new Jet[afOneJets.length];
		for (int i = 0; i < afOneJets.length; i++) {
			allJets[i] = afOneJets[i];
		}

		return allJets;
	}

	public void listFleet() {
		
		
	}

	public void fly() {
		Jet[] jets = getAllJets();
		for(Jet j : jets) {
			System.out.println("Model: " + j.getModel() + "Speed: " + j.getSpeed() + "Range: "
			+ j.getRange() + "Price: " + j.getPrice() + "Type: " + getType());
			System.out.println("Flight Time: " + (j.getRange() / j.getSpeed()));
		}
	}

	public void viewFastest() {
		// TODO Auto-generated method stub
		
	}

	public void viewRange() {
		// TODO Auto-generated method stub
		
	}

	public void loadCargo() {
		// TODO Auto-generated method stub
		
	}

	public void dogFight() {
		// TODO Auto-generated method stub
		
	}

	public void quitProg() {
		// TODO Auto-generated method stub
		
	}

}
