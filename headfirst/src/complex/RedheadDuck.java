package complex;


public class RedheadDuck implements Quackable {

	Observable observable;

	public RedheadDuck() {
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("Quack");
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
