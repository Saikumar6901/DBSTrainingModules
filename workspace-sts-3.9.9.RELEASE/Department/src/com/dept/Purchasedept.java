package com.dept;

public class Purchasedept  implements Department {
String deptname;
	public Purchasedept() {
		// TODO Auto-generated constructor stub
	}
	public Purchasedept(String deptname) {
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
