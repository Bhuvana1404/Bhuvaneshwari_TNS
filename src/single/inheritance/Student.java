package single.inheritance;

public class Student extends Citizen {
	private int stuid;
	private String clgname;
	public  Student() {
		super();
	}
	public Student(String name, String aadharNo, String address, long phno, int stuid, String clgname) {
		super(name, aadharNo, address, phno); 
		this.stuid= stuid;
		this.clgname = clgname;
	}
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getClgname() {
		return clgname;
	}
	public void setClgname(String clgname) {
		this.clgname = clgname;
	}
	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", clgname=" + clgname + ", Name=" + getName()
		+ ", AadharNo=" + getAadharNo() + ", Address=" + getAddress() + ", Phno=" + getPhno()+ "]";
		
		
	}

}
