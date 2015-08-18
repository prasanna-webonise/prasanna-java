
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "info")
public class Student {
	@Id
	@Column(name = "roll_no")
	private int rollNo;
	@Column(name = "name")
	private String name;
	@Column(name = "dob")
	private Date dob;
	@Column(name = "ph_num")
	private long phoneNum;

	public Student() {

	}

	public Student(int rollNo, String name, Date dob, long phoneNum) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dob = dob;
		this.phoneNum = phoneNum;
	}

	public Student(String name, Date dob, long phoneNum) {
		this.name = name;
		this.dob = dob;
		this.phoneNum = phoneNum;

	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (rollNo != other.rollNo)
			return false;
		return true;
	}
}
