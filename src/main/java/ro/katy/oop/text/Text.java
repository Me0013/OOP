package ro.katy.oop.text;
import java.util.*;

public class Text {
	

	String text1 = "alabalaportocala vino la distractie";
	
	//Using split (using an array and the ‘for’ control structure)
	String[] arrayText1 = text1.split(" ");
			

	
	for (int i = 0; i < arrayText1.length; i++) {
		System.out.println(arrayText1[i]);
	}
	

}
	



