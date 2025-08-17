package Hierarchical.Inheritance;

public class Person2 extends Person1
	{
		private String clas;
		private float per;
		public Person2() {
			System.out.println("Person2 class default constructor");
			clas="FY";
			per=70;
		}
		public Person2(String clas, float per) {
			this.clas = clas;
			this.per = per;
		}
		
		public String getClas() {
			return clas;
		}
		public void setClas(String clas) {
			this.clas = clas;
		}
		public float getPer() {
			return per;
		}
		public void setPer(float per) {
			this.per = per;
		}
		public Person2(String name, String city,String clas, float per )
		{
			this.clas = clas;
			this.per = per;
		}
		@Override
		public String toString() {
			return "Person2 [clas=" + clas + ", per=" + per + ",Name=" + getName() + ", City=" + getCity() + "]";
		}
		
		
	}



