package org.triplesic.factory;

public class ToyFactory {
	public static Toy build(ProductionLine prodLine) {

		// Build toy by production line name
		if (prodLine.equals(ProductionLine.DRONE)) {
			return new Drone();
		} else if (prodLine.equals(ProductionLine.JUMPINGFROG)) {
			return new JumpingFrog();
		} else if (prodLine.equals(ProductionLine.RACINGCAR)) {
			return new RacingCar();
		} else {
			return null;
		}
		
	}
}
