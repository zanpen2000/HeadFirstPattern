package StrategyPattern;

public class MallardDuck extends Duck {

	public MallardDuck(){
		this.flyBehavior  = new FlyWithWings();
		this.quackBehavior = new Quack();
		
	}
	
	@Override
	public void display() {
		System.out.println("I'm a MallardDuck");
	}

	
}
