package com.helloworld;

public class Helloworld {
	 String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void sayHello() {
		System.out.println(msg);
	}
	public boolean equals(Object o) {
		Helloworld h=(Helloworld)o;
		return h.getMsg()!= this.getMsg();
	}
}


