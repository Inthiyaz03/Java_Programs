package com.tap;

abstract class Plane{
	abstract void takeOff();
	abstract void fly();
	abstract void land();
}

class CargoPlane extends Plane{
	@Override
	void takeOff() {
		System.out.println("cargo takeoff");
	}
	@Override
	void fly() {
		System.out.println("cargop flies");
	}
	@Override
	void land() {
		System.out.println("cargop lands");
	}
}

class PassengerPlane extends Plane{
	@Override
	void takeOff() {
		System.out.println("PassengerPlane takeoff");
	}
	@Override
	void fly() {
		System.out.println("PassengerPlane flies");
	}
	@Override
	void land() {
		System.out.println("PassengerPlane lands");
	}
}

class FighterPlane extends Plane{
	@Override
	void takeOff() {
		System.out.println("FighterPlane takeoff");
	}
	@Override
	void fly() {
		System.out.println("FighterPlane flies");
	}
	@Override
	void land() {
		System.out.println("FighterPlane lands");
	}
}
class Airport{
	void permit(Plane p) {
		p.takeOff();
		p.fly();
		p.land();
	}
}

public class Abstraction {

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
