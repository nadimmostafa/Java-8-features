package org.nadim.streams.collectors;

public class Student {
	int sid;
	String name;
	String male;
	String dept;
	
	public Student(int sid, String name, String male, String dept) {
		super();
		this.sid = sid;
		this.name = name;
		this.male = male;
		this.dept = dept;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMale() {
		return male;
	}

	public void setMale(String male) {
		this.male = male;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", dept=" + dept + "]";
	}

}
