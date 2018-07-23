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
			if (model.equals(jets[i].getModel())) {
				indexes[i] = true;
				numMatchingIndexes++;
				if (model.equals(jets[i].getModel())) {
					indexes[i] = true;
					numMatchingIndexes++;
				}
			}
		}

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
		Jet[] allJets = new Jet[afOneJets.length];
		for (int i = 0; i < afOneJets.length; i++) {
			allJets[i] = afOneJets[i];
		}

		return allJets;
	}

	public void listFleet() {
		Jet[] afOneJets = afOne.getJets();
		for (int i = 0; i < afOneJets.length; i++) {
			System.out.println(afOneJets[i]);
		}

	}

//Jet details and the amount of time the Jet can fly until it runs out of fuel (based on speed and range).
	public void fly() {
		Jet[] jets = getAllJets();
		for (Jet j : jets) {
			j.fly();
		}
	}

	public void viewFastest() {
		Jet[] jets = getAllJets();
		Jet fastest = jets[0];
		for (Jet j : jets) {
			if (fastest.getSpeed() < j.getSpeed()) {
				fastest = j;

			}

		}
		System.out.println(fastest);

	}

	public void viewRange() {
		Jet[] jets = getAllJets();
		Jet range = jets[0];
		for (Jet j : jets) {
			if (range.getRange() > j.getRange()) {
				range = j;
			}
		}System.out.println(range);

	}

	public void loadCargo() {
		System.out.println("Cargo loaded!");

	}

	public void dogFight() {
		System.out.println("Dog fight! PEW PEW PEW PEW!");
	}

	public void quitProg() {
		System.exit(0);

	}

}
