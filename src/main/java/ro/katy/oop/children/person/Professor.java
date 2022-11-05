package ro.katy.oop.children.person;
import ro.katy.oop.parent.person.*;


public class Professor extends Person {
	public Professor (String firstName, String lastName, String profession, int age, long CNP, int salary) {
		super(firstName, lastName, profession, age, CNP, salary);
		}

	@Override
	public void walk() {
		System.out.println("I walk to the classroom.");
	}
	
	
	@Override
	public void work() {
		System.out.println("I am a professor.");
	}
	
	public void teach() {
		System.out.println("I teach students.");
	}
	
}
