package com.tap;

@FunctionalInterface
interface Aircraft{
	abstract void takeOff();
	default void method() {
		System.out.println("default method called");
	}
}


abstract class Plane implements Aircraft{
	
	public void takeOff(){
		System.out.println("plane takes off");
	}
	 abstract void fly();
	 static void land() {
		 System.out.println("plane is landing");
	 }
}


class CargoPlane extends Plane{
	@Override
	public
	void takeOff() {
		System.out.println("cargo plane takes off");
	}
	@Override
	void fly() {
		System.out.println("cargo plane fly");
	}

	static void land() {
		System.out.println("cargo plane is landing");
		
	}
}


class PassengerPlane extends Plane{
	@Override
	public
	void takeOff() {
		System.out.println("Passenger plane takes off");
	}
	@Override
	void fly() {
		System.out.println("Passenger plane fly");
	}
	
	static void land() {
		System.out.println("Passenger plane is landing");
		
	}
}
class FighterPlane extends Plane{
	@Override
	public void takeOff() {
		System.out.println("Fighter plane takes off");
	}
	@Override
	void fly() {
		System.out.println("Fighter plane fly");
	}
	
	static void land() {
		System.out.println("Fighter plane is landing");
		
	}
}


class Airport{
	void permit(Plane plane) {
		plane.takeOff();
		plane.fly();
		
		if(plane instanceof CargoPlane){
			plane.land();
		}
		
		
		
		
	}
}



public class launch {

	public static void main(String[] args) {
		
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		
		Airport a = new Airport();
		
		a.permit(pp);
		System.out.println("---------------------");
	
		a.permit(fp);
		System.out.println("---------------------");
		a.permit(cp);

	}

}
