package IteratorPattern;

import java.util.Iterator;

import IteratorPattern.component.MenuComponent;

public class Waitress {
	MenuComponent allMenus;
	

	public Waitress(MenuComponent menu) {
		this.allMenus = menu;
	}

	public void printMenu() {
		allMenus.print();
	}

}
