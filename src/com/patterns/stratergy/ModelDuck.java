package com.patterns.stratergy;

public class ModelDuck extends Duck {

     public ModelDuck() {
		// TODO Auto-generated constructor stub
    	 
    	 flyBehavior=new FlyNoWay();
    	 quackBehavior= new Squeak();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub

		System.out.println("I'am a model duck!!");
	}

}
