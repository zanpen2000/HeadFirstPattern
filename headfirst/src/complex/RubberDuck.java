package complex;


public class RubberDuck implements Quackable {

	Observable observable;
	
	public RubberDuck() {
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		System.out.println("Squeak");
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
	@Override
	public String toString() {
		return this.getClass().getName();
	}

}
