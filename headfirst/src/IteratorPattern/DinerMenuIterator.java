package IteratorPattern;

import java.nio.channels.IllegalSelectorException;
import java.util.Iterator;

import IteratorPattern.component.MenuItem;

public class DinerMenuIterator implements Iterator {
	MenuItem[] menuItems;
	int position = 0;

	public DinerMenuIterator(MenuItem[] menuItems2) {
		this.menuItems = menuItems2;
	}

	@Override
	public boolean hasNext() {
		if (position >= menuItems.length || menuItems[position] == null)
			return false;
		else
			return true;
	}

	@Override
	public Object next() {
		MenuItem menuItem = menuItems[position];
		position = position + 1;
		return menuItem;
	}

	@Override
	public void remove() {
		if (position <= 0) {
			throw new IllegalSelectorException();
		}
		if (menuItems[position - 1] != null) {
			for (int i = position - 1; i < (menuItems.length - 1); i++) {
				menuItems[i] = menuItems[i + 1];
			}
			menuItems[menuItems.length - 1] = null;
		}
	}

}
