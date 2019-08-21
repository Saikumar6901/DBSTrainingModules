package com.calculator;

public class CalcB implements Calc{
	int firstnum,secondnum;
	public CalcB(int firstnum,int secondnum) {
		// TODO Auto-generated constructor stub
		this.firstnum=firstnum;
		this.secondnum=secondnum;
	}

	public int getFirstnum() {
		return firstnum;
	}

	public void setFirstnum(int firstnum) {
		this.firstnum = firstnum;
	}

	public int getSecondnum() {
		return secondnum;
	}

	public void setSecondnum(int secondnum) {
		this.secondnum = secondnum;
	}

	public void add() {
		int sum=firstnum+secondnum;
		System.out.println("in CalcB "+sum);
	}
}
