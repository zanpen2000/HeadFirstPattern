package IteratorPattern;

public class MenuTestDrive {
	public static void main(String[] args) {
		PancakeHouseMenu pancakeMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		
		Waitress waitress = new Waitress(pancakeMenu, dinerMenu);
		waitress.printMenu();
	}
}
