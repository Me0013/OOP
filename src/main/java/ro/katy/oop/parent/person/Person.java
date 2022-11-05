package ro.katy.oop.parent.person;

public class Person {
	
	private String firstName;
	private String lastName;
	private String profession; 
	private int age; 
	private long CNP;
	private int salary;
	
	public Person(String firstName, String lastName, String profession, int age, long CNP,int salary) {
		this.firstName = firstName; 
		this.lastName = lastName; 
		this.profession = profession; 
		this.age = age;
		this.CNP = CNP;
		this.salary = salary;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String newFirstName) {
		this.firstName = newFirstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String newLastName) {
		this.lastName = newLastName;
	}
	
	public String getProfession() {
		return profession;
	}
	
	public void setProfession(String newProfessione) {
		this.profession = newProfessione;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	public long getCNP() {
		return CNP;
	}
	
	public void setCNP(long newCNP) {
		this.CNP = newCNP;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int newSalary) {
		this.salary = newSalary;
	}
	

	

	public void walk() {
		System.out.println("Walk");
	}
	
	public void work() {
		System.out.println("Work");
	}
	
	public void sleep() {
		System.out.println("Sleep");
	}
	

}
