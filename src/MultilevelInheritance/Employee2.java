package MultilevelInheritance;

import java.util.Date;

public class Employee2 extends Employee1{
	    private int noOfShares;
	    private String authority;
	    
	    public void LevelOneEmployee() {}
	    
	    public void LevelOneEmployee(String name, long contactNo, Date dateOfBirth,String deptName, double baseSalary, int noOfShares, String authority) {
	    	Super(name,contactNo,dateOfBirth,deptName, baseSalary);
	        this.noOfShares = noOfShares;
	        this.authority=authority;
	    }

		private void Super(String name, long contactNo, Date dateOfBirth, String deptName, double baseSalary) {
		};
			

		public int getNoOfShares() {
			return noOfShares;
		}

		public void setNoOfShares(int noOfShares) {
			this.noOfShares = noOfShares;
		}

		public String getAuthority() {
			return authority;
		}

		public void setAuthority(String authority) {
			this.authority = authority;
		}

		@Override
		public String toString() {
			return "LevelOneEmployee ["+super.toString()+"noOfShares=" + noOfShares + ", authority=" + authority + "]";
		}   
	}



