/**
 * 
 */
package com.db.corejava.model;

/**
 * @author Abridge Solutions
 *
 */
public class Employee {
   int empno;
   String ename;
   double sal;
	/**
	 * 
	 */
	public Employee(int empno,String ename,double sal) {
		// TODO Auto-generated constructor stub
		this.empno=empno;
		this.ename=ename;
		this.sal=sal;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String toString() {
		return "empno: "+empno+" ename: "+ename+" sal: "+sal;
	}
	public void showIdName() {
		System.out.println("empno: "+empno+" ename: "+ename);
	}

}
