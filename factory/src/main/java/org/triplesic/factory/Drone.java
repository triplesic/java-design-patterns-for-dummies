package org.triplesic.factory;

public class Drone implements Toy {

	public String getToyName() {
		return "Drone";
	}

	public String getToyColor() {
		return "White & Black";
	}

	public String getToyPrice() {
		return "$399";
	}
	
	public ProductionLine getProductionLine() {
		return ProductionLine.DRONE;
	}

	@Override
	public String toString() {
		return "name: " + getToyName() + "\ncolor: " + getToyColor() + "\nprice: " + getToyPrice();
	}
}
