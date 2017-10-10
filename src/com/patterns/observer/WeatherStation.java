package com.patterns.observer;

public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(90, 65, 27.6f);
		weatherData.setMeasurements(86, 88, 30.3f);
		
	}

}
