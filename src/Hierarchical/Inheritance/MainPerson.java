package Hierarchical.Inheritance;

public class MainPerson {
	public static void main(String[] args) {
		Person1 p1 = new Person1();
		System.out.println("----------------- Person Details ---------------------");
		System.out.println(p1);

		Person1 p;
		p = new Person1("Boss", "Chennai");
		if (p instanceof Person1)
			System.out.println("Person Details "+p);
		
		p = new Person3("Bhuvi", "Chennai", 101, 67000, "Sales");
		if (p instanceof Person3)
		System.out.println("Person2 Details "+p);
		

		p = new Person2("Harshi", "Pune", "FE", 88);
		if (p instanceof Person2)
			System.out.println("Student Details "+p);

	}

}


