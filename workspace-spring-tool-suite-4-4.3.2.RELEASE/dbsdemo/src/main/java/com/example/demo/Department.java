package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	int deptId;
	String manager;
	String deptname;
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", manager=" + manager + ", deptname=" + deptname + "]";
	}
}
