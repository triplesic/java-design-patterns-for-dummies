package org.triplesic.factory;

public class Main {
	public static void main(String[] args) {
		//build Drone
		Toy toy1 = ToyFactory.build(ProductionLine.DRONE);
		System.out.println("\n-- build drone --");
		System.out.println(toy1.toString());
		
		//build Jumping frog
		Toy toy2 = ToyFactory.build(ProductionLine.JUMPINGFROG);
		System.out.println("\n-- build jumping frog --");
		System.out.println(toy2.toString());
		
		//build Racing car
		Toy toy3 = ToyFactory.build(ProductionLine.RACINGCAR);
		System.out.println("\n-- build racing car --");
		System.out.println(toy3.toString());
	}
}
