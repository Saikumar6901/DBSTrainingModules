package com.dept;

public class Salesdept implements Department {
String deptname;
	public Salesdept() {
		// TODO Auto-generated constructor stub
	}
	public Salesdept(String deptname) {
		// TODO Auto-generated constructor stub
		this.deptname=deptname;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public void deptName() {
		System.out.println(deptname);
	}
}
