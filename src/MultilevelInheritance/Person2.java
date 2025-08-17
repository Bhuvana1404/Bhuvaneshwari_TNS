package MultilevelInheritance;
import java.util.Date;
public class Person2 extends Person1{
		private String deptName;
		private double baseSalary;
		
		public Person2() {}

		public Person2(String name, long contactNo, Date dateOfBirth, String deptName, double baseSalary) {
			super(name, contactNo, dateOfBirth);
			this.deptName = deptName;
			this.baseSalary = baseSalary;
		}

		public String getDeptName() {
			return deptName;
		}

		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}

		public double getBaseSalary() {
			return baseSalary;
		}

		public void setBaseSalary(double baseSalary) {
			this.baseSalary = baseSalary;
		}

		@Override
		public String toString() {
			return "Person2 ["+super.toString()+", deptName=" + deptName + ", baseSalary=" + baseSalary + "]";
		}

		
	}



