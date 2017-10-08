package com.patterns.stratergy;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model = new ModelDuck();
		model.performQuack();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
