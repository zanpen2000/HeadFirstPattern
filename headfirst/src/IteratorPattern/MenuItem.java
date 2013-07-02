package IteratorPattern;

public class MenuItem {
	String name;
	String description;
	boolean vegetarian;
	double price;

	public MenuItem(String name, String description, boolean vegetarian,
			double price) {
		super();
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return this.price;
	}

	public String getDescription() {
		return description;
	}

}
