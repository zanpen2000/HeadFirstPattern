package IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

import IteratorPattern.component.MenuComponent;
import IteratorPattern.component.Menu;
import IteratorPattern.component.MenuItem;


public class PancakeHouseMenu extends MenuComponent {
	ArrayList menuItems;

	public PancakeHouseMenu() {
		menuItems = new ArrayList();

		addItem("K&B's Pancake Breakfast",
				"Pancakes with scrambled eggs, and toast", true, 2.99);
		addItem("Regular Pancake Breakfast",
				"Pancakes with fried eggs, sausage", false, 3.49);
		addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries",
				true, 3.49);
		addItem("Waffles",
				"Waffles, with your choice of blueberries or strawberries",
				true, 3.59);

	}

	private void addItem(String name, String description, boolean vegetarian,
			double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}

	public Iterator createIterator() {
		return menuItems.iterator();
	}

}
