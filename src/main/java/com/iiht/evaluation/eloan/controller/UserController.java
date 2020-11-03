package com.iiht.evaluation.eloan.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iiht.evaluation.eloan.dao.ConnectionDao;
import com.iiht.evaluation.eloan.model.ApprovedLoan;
import com.iiht.evaluation.eloan.model.LoanInfo;
import com.mysql.cj.xdevapi.Statement;




@WebServlet("/user")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
private ConnectionDao connDao;
	
	public void setConnDao(ConnectionDao connDao) {
		this.connDao = connDao;
	}
	public void init(ServletConfig config) {
		String jdbcURL = config.getServletContext().getInitParameter("jdbcUrl");
		String jdbcUsername = config.getServletContext().getInitParameter("jdbcUsername");
		String jdbcPassword = config.getServletContext().getInitParameter("jdbcPassword");
		System.out.println(jdbcURL + jdbcUsername + jdbcPassword);
		this.connDao = new ConnectionDao(jdbcURL, jdbcUsername, jdbcPassword);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		
		String viewName = "";
		try {
			switch (action) {
			case "editLoanProcess"  :
				viewName=editLoanProcess(request,response);
				break;
			case "registerNewUser":
			viewName=registerNewUser(request,response);
			break;
			
			case "registeruser":
				viewName=registerUser(request,response);
				break;
			case "register":
				viewName = register(request, response);
				break;
			case "application":
				viewName = application(request, response);
				break;
			case "trackloan":
				viewName = trackloan(request, response);
				break;
			case "editloan":
				viewName = editloan(request, response);
				break;	
			case  "displaystatus" :
				viewName=displaystatus(request,response);
				break;
			default : viewName = "notfound.jsp"; break;	
			}
		} catch (Exception ex) {
			
			throw new ServletException(ex.getMessage());
		}
			RequestDispatcher dispatch = 
					request.getRequestDispatcher(viewName);
			dispatch.forward(request, response);
	}
	private String editLoanProcess(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// TODO Auto-generated method stub

		/* 
		 connect to database and retreive the loan info based on application number
		and redirect to the view page to edit 

		*/
		
		return null;
	}
	private String registerUser(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// TODO Auto-generated method stub

		/* create a new user account by reading data from user and redirect
		  to index page 
		*/
		
		return null;
	}
	private String registerNewUserPage(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// TODO Auto-generated method stub
		/* redirect to view page to read user credentials to create  */

		return null;
	}
	private String registerNewUser(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// TODO Auto-generated method stub
		
		/* create a new user account by reading data from user and redirect
		  to index page 
		*/
		
		return null;
	}
	private String register(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		/* return to register view page */
		
		return null;
	}
	private String displaystatus(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// TODO Auto-generated method stub
		
		/* read the application number and if the status is processing display info
		   as application is processing, else if status is processed read the info
		  and send to view page to display his loan information and return to the
		  appropriate pages

		*/
		
		return null;
	}

	private String editloan(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		/* return to editloan view page */
		
		return null;
	}

	private String trackloan(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		/* return to trackloan view page */
		
		return null;
	}

	private String application(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		/* return to application view page */
		
		return null;
	}
}