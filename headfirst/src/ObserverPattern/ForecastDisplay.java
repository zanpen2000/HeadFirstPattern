package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;
	private float lastPressure;
	private Observable observable;

	public ForecastDisplay(Observable obs) {
		this.observable = obs;
		this.observable.addObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current Pressure: " + currentPressure
				+ " and last pressure: " + lastPressure);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (o instanceof WeatherData) {
			WeatherData wd = (WeatherData) o;
			lastPressure = currentPressure;
			currentPressure = wd.getPressure();
			display();
		}
	}

}
