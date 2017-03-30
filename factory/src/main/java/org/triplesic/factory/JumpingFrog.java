package org.triplesic.factory;

public class JumpingFrog implements Toy {

	public String getToyName() {
		return "Jumping Frog";
	}

	public String getToyColor() {
		return "Green";
	}

	public String getToyPrice() {
		return "$3.50";
	}

	public ProductionLine getProductionLine() {
		return ProductionLine.JUMPINGFROG;
	}
	
	@Override
	public String toString() {
		return "name: " + getToyName() + "\ncolor: " + getToyColor() + "\nprice: " + getToyPrice();
	}
}
