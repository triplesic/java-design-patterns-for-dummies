package org.triplesic.builder;

import java.util.ArrayList;
import java.util.List;

import org.triplesic.builder.item.Item;
import org.triplesic.builder.item.burger.ChickenBurger;
import org.triplesic.builder.item.burger.VegBurger;
import org.triplesic.builder.item.colddrink.Coke;
import org.triplesic.builder.item.colddrink.Pepsi;

public final class Meal {
	private List<Item> items = new ArrayList<Item>();

	public Meal() {

	}

	private Meal(Builder builder) {
		this.items = builder.items;
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public float getCost() {
		float cost = 0.0f;

		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}

	public void showItems() {

		for (Item item : items) {
			System.out.print("Item : " + item.name());
			System.out.print(", Packing : " + item.packing().pack());
			System.out.println(", Price : " + item.price());
		}
	}

	public static class Builder {
		private List<Item> items = new ArrayList<Item>();

		public Builder() {
		}

		public Builder buildVegMeal() {
			this.items.add(new VegBurger());
			this.items.add(new Coke());
			return this;
		}

		public Builder buildNonVegMeal() {
			this.items.add(new ChickenBurger());
			this.items.add(new Pepsi());
			return this;
		}

		public Builder addVegBurger(){
			this.items.add(new VegBurger());
			return this;
		}
		
		public Builder addChickenBurger(){
			this.items.add(new ChickenBurger());
			return this;
		}
		public Builder addCoke(){
			this.items.add(new Coke());
			return this;
		}
		
		public Builder addPepsi(){
			this.items.add(new Pepsi());
			return this;
		}
		
		public Meal build() {
			return new Meal(this);
		}
	}

}
