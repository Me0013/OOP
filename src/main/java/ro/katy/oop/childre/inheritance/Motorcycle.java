package ro.katy.oop.childre.inheritance;

import ro.katy.oop.parent.inheritance.*;
import ro.katy.oop.parent.interfaces.*;

public class Motorcycle extends Vehicles implements ActionsForVehicles{
	

		public Motorcycle(String colour, String model, int year, int price, int noOfWheels) {
		super(colour, model, year, price, noOfWheels);
		}
		
		public void move() {
			  System.out.println("The motorcycle can move.");
		}

		public void stop() {
			  System.out.println("The motorcycle can stop.");
		}
		
		public void right() {
			  System.out.println("The motorcycle can go right");
		}
		
		public void left() {
			  System.out.println("The motorcycle can go left");
		}
		
		public void speedUp() {
			  System.out.println("The motorcycle can speed up.");
		}
		
		public void speedDown() {
			  System.out.println("The motorcycle can speed down.");
		}
		
}
		