package MultilevelInheritance;
import java.util.Date;
public class Person1 {
		private String name;
		private long conatctNo;
		private Date dateOfBirth;
	// constructor
		public Person1(String name, long conatctNo, Date dateOfBirth) {
			super();
			this.name = name;
			this.conatctNo = conatctNo;
			this.dateOfBirth = dateOfBirth;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public long getConatctNo() {
			return conatctNo;
		}

		public void setConatctNo(long conatctNo) {
			this.conatctNo = conatctNo;
		}

		public Date getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		public Person1() {
		}

		@Override
		public String toString() {
			return "Person1 [name=" + name + ", conatctNo=" + conatctNo + ", dateOfBirth=" + dateOfBirth + "]";
		}

	}



