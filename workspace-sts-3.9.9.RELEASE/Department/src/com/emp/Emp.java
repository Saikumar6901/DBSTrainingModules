package com.emp;

import com.dept.Department;

public class Emp {
String name;
 int id;
 Department dept;
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public Emp(String name,int id,Department dept) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.id=id;
		this.dept=dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept= dept;
	}
	public void getDetails() {
		System.out.println(id+" "+name);
		dept.deptName();
	}
	public String toString() {
		return id+" "+name+" "+dept;
	}
}
