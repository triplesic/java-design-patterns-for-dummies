package org.triplesic.builder.item.colddrink;

import org.triplesic.builder.item.Item;
import org.triplesic.builder.packing.Bottle;
import org.triplesic.builder.packing.Packing;

public abstract class ColdDrink implements Item {
	
	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
	
}
