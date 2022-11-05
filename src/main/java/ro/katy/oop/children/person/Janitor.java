package ro.katy.oop.children.person;
import ro.katy.oop.parent.person.*;

public class Janitor extends Person {
	public Janitor (String firstName, String lastName, String profession, int age, long CNP, int salary) {
		super(firstName, lastName, profession, age, CNP, salary);
		}
	
	@Override
	public void walk() {
		System.out.println("I walk to the local school where I work.");
	}
	
	
	@Override
	public void work() {
		System.out.println("I am a janitor.");
	}

	public void clean() {
		System.out.println("I clean the classrooms.");
	}
	
}
