
public class ModelDuck extends Duck {
	
	public ModelDuck(){
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new Quack();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

		System.out.println("I'm a model duck!");
	}

}
