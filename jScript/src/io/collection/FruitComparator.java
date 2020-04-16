package io.collection;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.getPrice() - o2.getPrice();
	}

}// e of c
