package com.skilldistilery.jets;

public interface CombatReady {

	public void fight();
	public void fight(Jet jet);
	public static void fly() {
		System.out.println("Fighter Jets are ready for COMBAT!");
	}
}
