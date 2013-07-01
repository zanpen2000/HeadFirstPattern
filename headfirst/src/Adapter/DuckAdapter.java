package Adapter;

public class DuckAdapter implements Turkey {

	MallardDuck duck ;
	
	
	
	public DuckAdapter(MallardDuck duck) {
		super();
		this.duck = duck;
	}

	@Override
	public void gobble() {
		duck.quack();
	}

	@Override
	public void fly() {
		duck.fly();
	}

}
