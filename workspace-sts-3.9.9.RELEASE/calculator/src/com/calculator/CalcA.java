package com.calculator;

public class CalcA implements Calc{
int firstnum,secondnum;
	public CalcA(int firstnum,int secondnum) {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
	}
	public void add() {
		int sum= firstnum+secondnum;
		System.out.println("in CalcA "+sum);
	}

}
