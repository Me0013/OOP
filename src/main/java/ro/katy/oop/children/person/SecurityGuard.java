package ro.katy.oop.children.person;
import ro.katy.oop.parent.person.*;

public class SecurityGuard extends Person {
	public SecurityGuard (String firstName, String lastName, String profession, int age, long CNP, int salary) {
		super(firstName, lastName, profession, age, CNP, salary);
		}

	
	@Override
	public void walk() {
		System.out.println("I walk during the work hours.");
	}
	
	
	@Override
	public void work() {
		System.out.println("I am a security guard.");
	}


	
}
