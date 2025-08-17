package Hierarchical.Inheritance;

public class Person1 {
		private String name;
		private String city;

		public Person1() {
			System.out.println("Person1 class default constructor");
			name="Boss";
			city="Chennai";
		}

		public Person1(String name, String city) {
			this.name = name;
			this.city = city;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", city=" + city + "]";
		}

		

	}



