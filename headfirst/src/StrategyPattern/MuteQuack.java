package StrategyPattern;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("I can't Quack");
	}

}
