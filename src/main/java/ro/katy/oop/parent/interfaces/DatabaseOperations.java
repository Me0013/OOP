package ro.katy.oop.parent.interfaces;
import ro.katy.oop.model.*;

public interface DatabaseOperations {
	
	  public void createEntity(Entity entity);

	  public void readEntity(Long identifier);

	  public void updateEntity(Entity entity);

	  public void deleteEntity(Long identifier);


}
