package com.beans;

public class Authentication {

   String uname,pass;
   boolean  bool;
   public void setUname(String user) {
	   uname=user;
   }
   public void setPass(String pwd) {
	   pass=pwd;
   }
   public String getUname() {
	   return uname;
   }
   public String getPass() {
	   return pass;
   }
   public boolean isValid() {
	   if(uname.equals("admin") && pass.equals("admin"))
		   bool= true;
	   else
	       bool = false;
	   return bool;
   }
}
