package com.sj.currency;

public class eurosToRupees implements CurrencyConverter{

	public eurosToRupees() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double convertCurrency(double amount) {
		// TODO Auto-generated method stub
		System.out.println("eurosToRupees");
		return 79.92*amount;
	}

}
