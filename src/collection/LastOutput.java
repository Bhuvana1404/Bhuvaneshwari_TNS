package collection;
//comparable and comparator
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class LastOutput {

	public static void main(String[] args) {
		// Adding User Defined objects into ArrayList
		List<Student> studentList = new ArrayList<Student>();
		Student s1 = new Student(11, "bhuvi", 96);
		studentList.add(s1);
		s1 = new Student(21, "yogi", 85);
		studentList.add(s1);
		s1 = new Student(13, "kathija", 87);
		studentList.add(s1);
		s1 = new Student(41, "gomathi", 93);
		studentList.add(s1);
		System.out.println("Students Details are as follows\n" + studentList);

		System.out.println("---------------Student Details Before Sorting-------------------");
		System.out.println(studentList);

		// Using Comparable interface
		Collections.sort(studentList);

		System.out.println("---------------Student Details After Sorting-------------------");
		System.out.println(studentList);

		// Adding Person objects into ArrayList
		List<Person> personList = new ArrayList<Person>();
		Person p1 = new Person("charu", "Mumbai");
		personList.add(p1);

		p1 = new Person("aafia", "Pune");
		personList.add(p1);

		p1 = new Person("summo", "Bangalore");
		personList.add(p1);

		p1 = new Person("sandy", "Delhi");
		personList.add(p1);

		System.out.println("Person list is as follows\n" + personList);

		// Using Comparator interface
		System.out.println("---------------Person Details Before Sorting-------------------");
		System.out.println(personList);

		Comparator<Person> pComp=new SortByName();
		Collections.sort(personList,pComp );
		System.out.println("---------------Person Details After Sorting by Name -------------------");
		System.out.println(personList);
		
		pComp=new SortByCity();
		Collections.sort(personList, pComp);
		System.out.println("---------------Person Details After Sorting by City -------------------");
		System.out.println(personList);
	}

}



