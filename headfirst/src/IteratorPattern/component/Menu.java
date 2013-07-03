package IteratorPattern.component;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {

	ArrayList menuComponents = new ArrayList();
	String name;
	String description;

	public Menu(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public MenuComponent getChild(int i) {
		return (MenuComponent) menuComponents.get(i);
	}

	@Override
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}

	@Override
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("------------------------------");

		Iterator iter = menuComponents.iterator();
		while (iter.hasNext()) {
			MenuComponent menuComponent = (MenuComponent) iter.next();
			menuComponent.print();

		}
	}

}
