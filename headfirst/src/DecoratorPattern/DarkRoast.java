package DecoratorPattern;

public class DarkRoast extends Beverage {
	
	public DarkRoast() {
		description = "Dark Roast";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.99;
	}

}
