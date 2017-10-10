package com.patterns.observer;

public class CurrentConditionsDisplay implements Observer,DisplayElements{

	private float temprature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		// TODO Auto-generated constructor stub
		
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
	}
	
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions : "+temprature + "F degrees and "+humidity+"% humidity "+pressure+" is the pressure");
		
	}

	@Override
	public void update(float temprature, float humidity, float pressure) {
		// TODO Auto-generated method stub
	this.temprature=temprature;
	this.humidity=humidity;
	this.pressure=pressure;
	display();
		
	}

}
