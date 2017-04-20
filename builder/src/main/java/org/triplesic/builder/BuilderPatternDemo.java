package org.triplesic.builder;

public class BuilderPatternDemo {
	public static void main(String[] args) {

		System.out.println("----------- basic builder -----------");
		/*
		 * basic builder class
		 */
		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost() + "\n");

		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("Non-Veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost() + "\n");
		
		System.out.println("----------- advance builder -----------");
		/*
		 * advance builder class
		 */
		Meal vegMeal2 = new Meal
				.Builder()
				.buildVegMeal()
				.build();
		System.out.println("Veg Meal (advance build)");
		vegMeal2.showItems();
		System.out.println("Total Cost: " + vegMeal2.getCost() + "\n");

		Meal nonVegMeal2 = new Meal
				.Builder()
				.buildNonVegMeal()
				.build();
		System.out.println("Non-Veg Meal (advance build)");
		nonVegMeal2.showItems();
		System.out.println("Total Cost: " + nonVegMeal2.getCost() + "\n");
		
		Meal customMeal1 = new Meal
				.Builder()
				.addChickenBurger()
				.addPepsi()
				.addPepsi()
				.build();
		System.out.println("custom Meal");
		customMeal1.showItems();
		System.out.println("Total Cost: " + customMeal1.getCost() + "\n");
		
		Meal customMeal2 = new Meal
				.Builder()
				.buildNonVegMeal()
				.addVegBurger()
				.addPepsi()
				.build();
		System.out.println("custom Meal 2");
		customMeal2.showItems();
		System.out.println("Total Cost: " + customMeal2.getCost() + "\n");
	}
}
