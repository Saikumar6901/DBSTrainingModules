package com.db.corejava.client;
import java.util.*;
import com.db.corejava.model.Employee;
public class User {

	public User() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Employee> emp=new ArrayList<>();		
     emp.add(new Employee(1,"sai",20000));		
     emp.add(new Employee(2,"saikumar",2000));		
     emp.add(new Employee(3,"kumar",200));
     emp.add(new Employee());
     for(Employee e:emp) {
     e.showIdName();
    // System.out.println(e);
    // System.out.println(e.getEmpno()+" "+e.getEname()+" "+e.getSal());
	}
	}
}
