package MultilevelInheritance;
import java.text.SimpleDateFormat;
import java.util.Date;
public class MainPerson {
		public static void main(String[] args) {

			Person1 p1 = new Person1("Boss", 835686572, new Date(1998, 06, 4));
			System.out.println(p1);

			p1 = new Person2("Bhuvi", 8080807070l, new Date(2005, 05, 14), "Sales", 45000);
			System.out.println(p1);

			p1 = new Person3("Sumathi", 9880807227l, new Date(1988, 15, 02), "Account", 85000, 200,
					"Signing Authority");
			System.out.println(p1);
		}

	}



