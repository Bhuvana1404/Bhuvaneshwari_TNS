package MultilevelInheritance;

import java.util.Date;

public class FinalOutput {

	public static void main(String[] args) {

				Person1 p1 = new Person1("Boss", 87952645299l, new Date(2001, 11, 21));
				System.out.println(p1);

				p1 = new Employee1();
				System.out.println(p1);

				p1 = new Employee2();
				System.out.println(p1);
			}

		

	}


