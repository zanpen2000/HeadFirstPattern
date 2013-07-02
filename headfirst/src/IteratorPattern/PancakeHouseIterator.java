package IteratorPattern;

import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator {

	ArrayList<MenuItem> menuItems;
	int index = 0;

	public PancakeHouseIterator(ArrayList<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		return index < this.menuItems.size() ;
	}

	@Override
	public Object next() {
		MenuItem mi = null;
		if (hasNext()) {
			mi = menuItems.get(index);
			index = index + 1;
		}
		return mi;
	}

}
