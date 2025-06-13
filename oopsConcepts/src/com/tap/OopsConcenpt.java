package com.tap;

import java.util.Scanner;
import java.util.concurrent.CancellationException;

abstract class VehicleSystem{
	private float fuel;
	private float distance;
	protected float fuelEfficiency;
	
	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the fuel");
		 fuel = scan.nextFloat();
		System.out.println("enter the distance");
		 distance = scan.nextFloat();
	}
	
	public void calcFuelEfficiency(){
		fuelEfficiency = distance/fuel;
	}
	
	abstract public void dispFuelEfficiency();
	
}

class Bike extends VehicleSystem{

	public void dispFuelEfficiency() {
		System.out.println("Bike fuel efficiency is " + fuelEfficiency);
	}	
}


class Car extends VehicleSystem{
	
	public void dispFuelEfficiency() {
		System.out.println("Car fuel efficiency is " + fuelEfficiency);
	}	
}


class Truck extends VehicleSystem{

	public void dispFuelEfficiency() {
		System.out.println("Truck fuel efficiency is " + fuelEfficiency);
	}	
}


class Transport{
	void permit(VehicleSystem v) {
		v.acceptInput();
		v.calcFuelEfficiency();
		v.dispFuelEfficiency();
	}
}

public class OopsConcenpt {

	public static void main(String[] args) {
		VehicleSystem v;
		Car c = new Car();
		Bike b = new Bike();
		Truck t = new Truck();
		
		Transport ts = new Transport();
		ts.permit(c);
		ts.permit(b);
		ts.permit(t);

	}

}
