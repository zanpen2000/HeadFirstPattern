package TemplateMethod.compareto;

import java.util.Arrays;

public class DuckSortTestDrive {

	public static void main(String[] args) {

		Duck[] ducks = { new Duck("111", 8), new Duck("222", 2),
				new Duck("333", 7), new Duck("444", 3), new Duck("555", 6)

		};
		
		System.out.println("Before sorting:");
		display(ducks);
		
		Arrays.sort(ducks);
		
		System.out.println("\nAfter sorting:");
		display(ducks);

	}

	private static void display(Duck[] ducks) {
		for (int i = 0; i < ducks.length; i++) {
			System.out.println(ducks[i]);
		}
	}
}
