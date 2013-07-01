package DecoratorPattern;

public class Decat extends Beverage {

	public Decat() {
		description = "Decat";
	}

	@Override
	public double cost() {
		return 0.36;
	}

}
