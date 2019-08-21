package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class car {
	@Id
	int id;
	String model;
	int yearsofuse;
	String color;
	double price;
	public car() {}
	public car(int id, String model, int yearsofuse, String color, double price) {
		super();
		this.id = id;
		this.model = model;
		this.yearsofuse = yearsofuse;
		this.color = color;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYearsofuse() {
		return yearsofuse;
	}
	public void setYearsofuse(int yearsofuse) {
		this.yearsofuse = yearsofuse;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "car [id=" + id + ", model=" + model + ", yearsOfUse=" + yearsofuse + ", color=" + color + ", price="
				+ price + "]";
	}
	
}
