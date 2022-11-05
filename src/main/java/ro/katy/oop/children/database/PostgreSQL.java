package ro.katy.oop.children.database;

import ro.katy.oop.parent.interfaces.DatabaseOperations;
import ro.katy.oop.model.Entity;


public class PostgreSQL implements DatabaseOperations {

	 
	  public void createEntity(Entity entity) {
	    System.out.println("Create entity in PostgreSQL database.");
	  }


	  public void readEntity(Long identifier) {
	    System.out.println("Read entity from  PostgreSQL database.");
	  }


	  public void updateEntity(Entity entity) {
	    System.out.println("Update entity in  PostgreSQL database.");
	  }

	
	  public void deleteEntity(Long identifier) {
	    System.out.println("Delete entity from PostgreSQL database.");
	  }

}
