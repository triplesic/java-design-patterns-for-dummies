package org.triplesic.builder.item.burger;

import org.triplesic.builder.item.Item;
import org.triplesic.builder.packing.Packing;
import org.triplesic.builder.packing.Wrapper;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
	
}
