package MultilevelInheritance;
import java.util.Date;
public class Person3 extends Person2 {
	    private int noOfShares;
	    private String authority;
	    
	    public Person3() {}
	    
	    public Person3(String name, long contactNo, Date dateOfBirth,String deptName, double baseSalary, int noOfShares, String authority) {
	    	super(name,contactNo,dateOfBirth,deptName, baseSalary);
	        this.noOfShares = noOfShares;
	        this.authority=authority;
	    }

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
			return "Person3 ["+super.toString()+"noOfShares=" + noOfShares + ", authority=" + authority + "]";
		}   
	}


