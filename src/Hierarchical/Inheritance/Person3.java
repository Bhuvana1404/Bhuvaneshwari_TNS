package Hierarchical.Inheritance;

public class Person3 extends Person2 {
	private int empId;
	private float salary;
	private String dept;
	
	
	public Person3 () {
		System.out.println("Person3 Class Default Constructor");
	}


	public Person3 (int empId, float salary, String dept){
		this.empId = empId;
		this.salary = salary;
		this.dept = dept;
	}
	
	
	public Person3 (String name, String city,int empId, float salary, String dept) {
		this.empId= empId;
		this.salary = salary;
		this.dept = dept;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Person3 [empId=" + empId + ", salary=" + salary + ", dept=" + dept + ", name=" + getName()
				+ ",City=" + getCity() + "]";
	}


}