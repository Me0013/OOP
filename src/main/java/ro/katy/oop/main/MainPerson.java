package ro.katy.oop.main;
import ro.katy.oop.children.person.*;
import ro.katy.oop.parent.person.*;

public class MainPerson {
	public static void main(String[] args) {
		
		Person ana = new Person("Ana","Popescu","helpdesk", 20, 2950202487569L, 4000);
		ana.work();
		ana.walk();
		ana.setAge(20);
		ana.setSalary(4000);
		ana.setFirstName("Ana");
		
		System.out.println("Hello, my name is " + ana.getFirstName()+ ", I am " + ana.getAge() +
				" years old and my salary is " +ana.getSalary()+ " EURO.");
		
		Professor jack = new Professor("Jack","Bauer","Professor", 45, 1700505947652L, 7000);
		jack.work();
		jack.walk();
		jack.teach();
		jack.setProfession("professor");
		jack.setFirstName("Jack");
		jack.setLastName("Bauer");	
		
		System.out.println("Hello, my name is " + jack.getFirstName()+ jack.getLastName() + ", I am a " + jack.getProfession()+".");
	
	
		Person isabella = new Professor("Isabella","Nabadi","Professor", 30, 27005059448596L, 6000);
		//isabella.teach();
		isabella.work();
	
		
		Student jacob = new Student("Jacob","Smith","Student", 21, 1700505984966L, 100);
		jacob.work();
		jacob.learn();
		jacob.sleep();
	
		
		SecurityGuard alex = new SecurityGuard("Alex","Johnson","Security Guard", 45, 170050598484L, 5000);
		alex.work();
		alex.sleep();
		
		//SecurityGuard maria = new Student("Maria","Williams","Student", 22, 270050849764L, 200);
		
		Janitor ralph = new Janitor("Ralph","Jones","Janitor", 60, 17005047184L, 4800);
		ralph.work();
		ralph.clean();
		
	
	}

}
