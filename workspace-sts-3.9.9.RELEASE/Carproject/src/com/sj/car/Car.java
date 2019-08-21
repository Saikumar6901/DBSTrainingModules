package com.sj.car;

public class Car {
	public String color;
	public String make;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(String color,String make) {
		this.color=color;
		this.make=make;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	public String toString() {
		return color+" "+make;
	}


}
