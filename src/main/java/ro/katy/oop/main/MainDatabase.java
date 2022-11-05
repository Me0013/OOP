package ro.katy.oop.main;

import ro.katy.oop.model.*;
import ro.katy.oop.children.database.*;
import ro.katy.oop.parent.interfaces.*;
import java.util.Scanner; 

public class MainDatabase {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter database");

	    String databaseName = myObj.nextLine();  // Read user input
	    
	    System.out.println("Database is " + databaseName);
		
		//String environment = "PostgreSQL";
	   DatabaseOperations operations;
	    
	    if (databaseName.equalsIgnoreCase("oracle")) {
	      operations = new Oracle();
	    } else if (databaseName.equalsIgnoreCase("MySQL")){
	      operations = new MySQL();
	    } else if (databaseName.equalsIgnoreCase("PostgreSQL")){
	    	operations = new PostgreSQL();
	    } else {
	    	System.out.println("Error, no Database was found.");
	    }
	    
	 
	    //operations.createEntity(new Entity());
	}

}
