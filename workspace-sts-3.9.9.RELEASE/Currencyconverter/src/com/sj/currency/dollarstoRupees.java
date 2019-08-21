package com.sj.currency;

public class dollarstoRupees implements CurrencyConverter{

	public dollarstoRupees() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double convertCurrency(double amount) {
		// TODO Auto-generated method stub
		System.out.println("dollarstoRupees");
		return 71.29*amount;
	}
}
