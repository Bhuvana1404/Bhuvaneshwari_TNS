package MultilevelInheritance;

import java.util.Date;

public class Employee1 extends Person1 {
		private String deptName;
		private double baseSalary;
		
		public void Employee1() {}

		public void Employee1(String name, long contactNo, Date dateOfBirth, String deptName, double baseSalary) {
			Super(name, contactNo, dateOfBirth);
			this.deptName = deptName;
			this.baseSalary = baseSalary;
		}

		private void Super(String name, long contactNo, Date dateOfBirth) {
			
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
			return "Employee ["+super.toString()+", deptName=" + deptName + ", baseSalary=" + baseSalary + "]";
		}

		
	}


}
