package com.dao;

import java.sql.*;
import java.util.ArrayList;

import com.bean.book.Book;
import com.db.DBConnector;

public class DAOLayer {
Connection conn=null;
Statement stmt = null;
	public DAOLayer() {
		// TODO Auto-generated constructor stub
	}
	public String insertData(Book b) {
		DBConnector db=new DBConnector();
		conn=db.getConnection();
		int bookid=b.getBookid();
		int price=b.getPrice();
		String title=b.getTitle();
		String author=b.getAuthor();
		 try {
			stmt = conn.createStatement();
      	String sql="insert into book values("+bookid+",'"+title+"','"+author+"',"+price+")";
      	int x=stmt.executeUpdate(sql);
      	if(x>0)
      		return "success";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   		return "failure" ;
	}
	public String updateData(Book b) {
		DBConnector db=new DBConnector();
		conn=db.getConnection();
		int bookid=b.getBookid();
		int price=b.getPrice();
		String title=b.getTitle();
		String author=b.getAuthor();
		 try {
			stmt = conn.createStatement();
			String sql="update book set title ='"+title+"' , author='"+author+"' , price="+price+" where bookid="+bookid;
        	int x=stmt.executeUpdate(sql);
	      	if(x>0)
	      		return "success";
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   		return "failure" ;
	}
	public String deleteData(int bookid) {
		DBConnector db=new DBConnector();
		conn=db.getConnection();
		 try {
			stmt = conn.createStatement();
			String sql="delete from book where bookid="+bookid;
        	int x=stmt.executeUpdate(sql);
	      	if(x>0)
	      		return "success";
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   		return "failure" ;
	}
	public Book viewData(int bookid) {
		Book b=new Book();
		DBConnector db=new DBConnector();
		conn=db.getConnection();
		try {
			stmt = conn.createStatement();
	    	String sql="select * from book where bookid="+bookid;
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
	    		b.setBookid(bookid);
	    		b.setTitle(rs.getString(2));
	    		b.setAuthor(rs.getString(3));
	    		b.setPrice(Integer.parseInt(rs.getString(4)));
	    	}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}
	public ArrayList<Book> viewAllData() {
		ArrayList<Book> ar=new ArrayList<>();
		DBConnector db=new DBConnector();
		conn=db.getConnection();
		String sql="select * from book";
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Book b=new Book();
	    		b.setBookid(Integer.parseInt(rs.getString(1)));
	    		b.setTitle(rs.getString(2));
	    		b.setAuthor(rs.getString(3));
	    		b.setPrice(Integer.parseInt(rs.getString(4)));
	    		ar.add(b);
	    	}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ar;
	}
}
