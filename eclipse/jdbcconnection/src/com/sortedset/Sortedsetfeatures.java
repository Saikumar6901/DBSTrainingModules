package com.sortedset;
import java.util.*;
class Employee implements Comparable<Employee>{
	int eid;
	String ename;
	public Employee(int eid,String ename) {
		this.eid=eid;
		this.ename=ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String toString() {
		return eid+" "+ename;
	}
	public int compareTo(Employee e) {
		return this.eid-e.eid;
	}
}
class Comparatorsortedset implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2) {
		return e1.ename.compareTo(e2.ename);
	}
}
class Comparatorsortedseteid implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2) {
		if(e1.eid>e2.eid)return -1;
		else if(e1.eid<e2.eid)return 1;
		return 0;
	}
}
public class Sortedsetfeatures{

	public Sortedsetfeatures() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> ar=new ArrayList<>();
		ar.add(new Employee(1,"sai"));
		ar.add(new Employee(7,"abhinav"));
		ar.add(new Employee(3,"bhargav"));
		ar.add(new Employee(4,"chetan"));
		ar.add(new Employee(5,"karthik"));
		System.out.println("Printing normal arraylist");
		System.out.println(ar);
		Collections.sort(ar);
		System.out.println("Printing arraylist after applying comparable");
		System.out.println(ar);
		Collections.sort(ar,new Comparatorsortedseteid());
		System.out.println("Printing arraylist after applying comparator based on eid");
		System.out.println(ar);
		Collections.sort(ar,new Comparatorsortedset());
		System.out.println("Printing arraylist after applying comparator based on ename");
		System.out.println(ar);
	}
}
