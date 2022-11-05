package ro.katy.oop.children.person;
import ro.katy.oop.parent.person.*;

public class Student extends Person {
	public Student (String firstName, String lastName, String profession, int age, long CNP, int salary) {
		super(firstName, lastName, profession, age, CNP, salary);
		}
	
	@Override
	public void walk() {
		System.out.println("I often walk in the parks.");
	}
	
	
	@Override
	public void work() {
		System.out.println("I do not work yet.");
	}

	public void learn() {
		System.out.println("I learn everyday.");
	}
	
}
