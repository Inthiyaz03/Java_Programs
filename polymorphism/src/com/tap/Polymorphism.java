package com.tap;


class Plane{
	void takeOff() {
		System.out.println("plane is taking off");
	}
	void fly() {
		System.out.println("plane flies");
	}
	void land() {
		System.out.println("plane is landing");
	}
}

class CargoPlane extends Plane {
	@Override
	void fly() {
		System.out.println("cargo plane flies at low heights");
	}
}

class PassengerPlane extends Plane{
	@Override
	void fly() {
		System.out.println("passenger plane flies at medium heights");
	}
}

class FighterPlane extends Plane{
	@Override
	void fly() {
		System.out.println("fighter plane flies at great height");
	}
}

class Airport{
	void permit(Plane p) {
		p.takeOff();
		p.fly();
		p.land();
		
	}
	
}

public class Polymorphism {

	public static void main(String[] args) {
		
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		
		Airport ai = new Airport();
		ai.permit(cp);
		ai.permit(pp);
		ai.permit(fp);
		
	}
}
