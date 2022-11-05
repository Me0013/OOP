package ro.katy.oop.childre.inheritance;

import ro.katy.oop.parent.inheritance.*;
import ro.katy.oop.parent.interfaces.*;

public class Car extends Vehicles implements ActionsForVehicles {

	public Car(String colour, String model, int year, int price, int noOfWheels) {
	super(colour, model, year, price, noOfWheels);
	}
	
	public void move() {
		  System.out.println("The car can move.");
	}

	public void stop() {
		  System.out.println("The car can stop.");
	}
	
	public void right() {
		  System.out.println("The car can go right");
	}
	
	public void left() {
		  System.out.println("The car can go left");
	}
	
	public void speedUp() {
		  System.out.println("The car can speed up.");
	}
	
	public void speedDown() {
		  System.out.println("The car can speed down.");
	}
	
	
	
	
	
	
	
	
}
