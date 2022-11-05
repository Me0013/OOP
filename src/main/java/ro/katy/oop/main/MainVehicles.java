package ro.katy.oop.main;

import ro.katy.oop.childre.inheritance.*;
import ro.katy.oop.parent.inheritance.*;

public class MainVehicles {
	
	public static void main(String[] args) {

	Car logan = new Car("blue", "Logan", 2000, 1500, 4);
	logan.move();
	logan.left();
	logan.setColour("blue");
	logan.setPrice(1500);
	logan.setModel("Logan");
	logan.setYear(2000);
	
	System.out.println("My car is a " + logan.getColour() +" " + logan.getModel()+  " from " + logan.getYear() 
			+ " that I sell for " + logan.getPrice() + " EURO.");
	
	
	Vehicles wheels = new Car("white", "No model", 1969, 100, 2);
	wheels.setColour("White");
	//wheels.move();
	
	System.out.println("The object 'wheels' doesn`t have access to .move(),  .left(), "
			+ "etc because it is created as a Vehicles object, not a Car object");
	 
	Motorcycle kawasaki = new Motorcycle("black", "Kawasaki", 2019, 4500, 2);
	kawasaki.setColour("black");
	kawasaki.setModel("Kawasaki");
	kawasaki.setNoOfWheels(4500);
	kawasaki.left();
	kawasaki.speedDown();

	System.out.println("My new motorcycle is a " + kawasaki.getColour() +" " 
	+ kawasaki.getModel()+ " that I bought for " + kawasaki.getPrice() + " EURO.");
	
	
	//Car some = new Motorcycle("red", "no name", 2006, 2500, 2);
	Vehicles some = new Motorcycle("red", "no name", 2006, 2500, 2);
	some.setNoOfWheels(2);
	System.out.println(some.getNoOfWheels());
	
	
	
	}
	

	
}


