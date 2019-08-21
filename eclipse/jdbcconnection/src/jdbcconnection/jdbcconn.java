package jdbcconnection;
import java.sql.*; 
//import java.util.*;

public class jdbcconn {

	public jdbcconn() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
		 //String DB_URL = "jdbc:mariadb://192.168.100.174/db";
		// String DB_URL1 = "jdbc:mariadb://localhost:3306/stud";
		 String DB_URL2 = "jdbc:mariadb://localhost:3306/sai";
		    //  Database credentials
		 String USER = "root";
		 String PASS = "password";
		 Connection conn = null;
	     Statement stmt = null;
		try
        { 
			Class.forName(JDBC_DRIVER);
			 System.out.println("Connecting to a selected database...");
	           conn = DriverManager.getConnection(DB_URL2, USER, PASS);
	            System.out.println("Connected database successfully...");
	            //STEP 4: Execute a query
	            System.out.println("selecting data from table in given database...");
	            stmt = conn.createStatement();
	            String sql="show tables";
	        //    String sqlcreate = "insert into emp(empno,ename,deptno) values(3,'saikumar',20)";
	            // insertion record,update, delete access executeupdate option
//	            int x = stmt.executeUpdate(sqlcreate);
//		           if(x>0)
//		        	   System.out.println("inserted successfully");
//		           else
//		        	   System.out.println("not inserted");
		         // selecting the records from table
	             ResultSet rs = stmt.executeQuery(sql);
	            int c=0;
	            while (rs.next()) 
	            {
	            	c++;
	               System.out.println(rs.getString(1));
	            } 
	            if(c==0)
	            	System.out.println("no data in the table");
            conn.close(); 
        } 
        catch(Exception ex) 
        { 
            System.err.println(ex); 
        } 
	}

}
