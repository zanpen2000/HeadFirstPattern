package complex;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {

	ArrayList quackers = new ArrayList();
	Observable observable;
	
	public Flock() {
		this.observable = new Observable(this);
	}

	public void add(Quackable quacker) {
		quackers.add(quacker);
	}

	@Override
	public void quack() {
		Iterator iter = (Iterator) quackers.iterator();
		while (iter.hasNext()) {
			Quackable quacker = (Quackable) iter.next();
			quacker.quack();
			notifyObservers();
		}
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
}
