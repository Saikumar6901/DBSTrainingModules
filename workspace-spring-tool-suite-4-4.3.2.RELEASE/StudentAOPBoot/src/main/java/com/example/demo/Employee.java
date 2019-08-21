package com.example.demo;

public class Employee {
  String name;
  int empid;
  public Employee() {}
  public Employee(String name, int empid) {
	super();
	this.name = name;
	this.empid = empid;
  }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", empid=" + empid + "]";
}
  
}
