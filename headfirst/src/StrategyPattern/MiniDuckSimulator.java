package StrategyPattern;

public class MiniDuckSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();

		Duck model = new ModelDuck();
		model.performFly();
		model.performQuack();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

		System.out.println("done!");
	}

}
