package com;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int usn;
	private String name;
	private String dept;
	private long phno;
	public int getUsn() {
		return usn;
	}
	public void setUsn(int usn) {
		this.usn = usn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public Student(int usn, String name, String dept, long phno) {
		super();
		this.usn = usn;
		this.name = name;
		this.dept = dept;
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + ", dept=" + dept + ", phno=" + phno + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
