package org.triplesic.factory;

public class RacingCar implements Toy{

	public String getToyName() {
		return "Racing Car";
	}

	public String getToyColor() {
		return "Red";
	}
	
	public String getToyPrice() {
		return "$99";
	}

	public ProductionLine getProductionLine() {
		return ProductionLine.RACINGCAR;
	}
	
	@Override
	public String toString() {
		return "name: " + getToyName() + "\ncolor: " + getToyColor() + "\nprice: " + getToyPrice();
	}
	
}
