package ObserverPattern;

public class WeatherStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WeatherData weatherData = new WeatherData();
		new CurrentConditionsDisplay(weatherData);
		new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4F);
		weatherData.setMeasurements(82, 70, 29.2F);
		weatherData.setMeasurements(78, 65, 32.3F);
	}

}
