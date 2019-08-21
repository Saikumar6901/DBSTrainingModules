package com.user;

import com.calculator.Calc;

public class User {
  String name;
 Calc cal;
	public User(String name,Calc cal) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.cal=cal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Calc getCal() {
		return cal;
	}
	public void setCal(Calc cal) {
		this.cal = cal;
	}
	public User() {}

	public void addVariables() {
	  System.out.println(name); 
	  cal.add();
	}
}
