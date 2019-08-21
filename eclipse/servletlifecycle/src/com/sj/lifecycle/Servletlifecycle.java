package com.sj.lifecycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servletlifecycle
 */
@WebServlet("/Servletlifecycle")
public class Servletlifecycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public Servletlifecycle() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init() {
        // initialize the servlet, and print something in the console.
        System.out.println("Servlet Initialized!");
    }
//    public void service(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//         
//        // the service method will 
//        response.setContentType("text/html");
//         
//        PrintWriter out = response.getWriter();
//        System.out.println("in service method");
//    }
     
    @Override
    public void destroy() {
        // close connections etc.
    	System.out.println("in destroy");
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//System.out.println("jhi");
		int n1=Integer.parseInt(request.getParameter("first"));
		int n2=Integer.parseInt(request.getParameter("second"));
		
		PrintWriter out= response.getWriter();
		try {
	    out.println(n1/n2);
		}
		catch(Exception e) {
			throw e;
		}
	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
