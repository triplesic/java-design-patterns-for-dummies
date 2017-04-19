package org.triplesic.builder;

import org.triplesic.builder.item.burger.ChickenBurger;
import org.triplesic.builder.item.burger.VegBurger;
import org.triplesic.builder.item.colddrink.Coke;
import org.triplesic.builder.item.colddrink.Pepsi;

public class MealBuilder {
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
