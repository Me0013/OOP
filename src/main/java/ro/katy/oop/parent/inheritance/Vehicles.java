package ro.katy.oop.parent.inheritance;

public class Vehicles {
	
	private String colour; 
	private String model;
	private int year;
	private int price;
	private int noOfWheels;

	public Vehicles(String colour, String model, int year, int price, int noOfWheels) {
		this.colour = colour;
		this.model = model;
		this.year = year;
		this.price = price; 
		this.noOfWheels = noOfWheels;
	}
	

	public String getColour() {
		return colour;
	}
	
	public void setColour(String newColour) {
		this.colour = newColour;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String newModel) {
		this.model = newModel;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int newYear) {
		this.year = newYear; 
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int newPrice) {
		this.price = newPrice; 
	}
	
	public int getNoOfWheels() {
		return noOfWheels;
	}
	
	public void setNoOfWheels(int newNoOfWheels) {
		this.noOfWheels = newNoOfWheels; 
	}
	
	
}
