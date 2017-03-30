package org.triplesic.factory;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ToyFactoryTest {

	@Test
	public void testBuildDrond() {
		Toy drone = ToyFactory.build(ProductionLine.DRONE);
		verifyProduct(drone, ProductionLine.DRONE);
	}

	@Test
	public void testBuildJumpingFrog() {
		Toy jumpingFrog = ToyFactory.build(ProductionLine.JUMPINGFROG);
		verifyProduct(jumpingFrog, ProductionLine.JUMPINGFROG);
	}

	@Test
	public void testBuildRacingCar() {
		Toy racingCar = ToyFactory.build(ProductionLine.RACINGCAR);
		verifyProduct(racingCar, ProductionLine.RACINGCAR);
	}

	private void verifyProduct(Toy toy, ProductionLine prodLine) {
		assertTrue("The production line should be : " + prodLine, toy.getProductionLine().equals(prodLine));
	}
}
