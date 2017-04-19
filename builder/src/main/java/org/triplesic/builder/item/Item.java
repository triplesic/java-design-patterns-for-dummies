package org.triplesic.builder.item;

import org.triplesic.builder.packing.Packing;

public interface Item {
	public String name();
	public Packing packing();
	public float price();
}
