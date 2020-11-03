package com.iiht.evaluation.eloan.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iiht.evaluation.eloan.dao.ConnectionDao;
import com.iiht.evaluation.eloan.dao.LoanDao;
import com.iiht.evaluation.eloan.model.LoanInfo;

/**
 * Servlet implementation class PlaceLoan
 */
@WebServlet({ "/PlaceLoan", "/placeloan" })
public class PlaceLoan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlaceLoan() {
        super();
        // TODO Auto-generated constructor stub
    }
private LoanDao loanDao;
	
	
	public void setLoginDao(LoanDao loanDao) {
		this.loanDao = loanDao;
	}

	public void init(ServletConfig config) {
		String jdbcURL = config.getServletContext().getInitParameter("jdbcUrl");
		String jdbcUsername = config.getServletContext().getInitParameter("jdbcUsername");
		String jdbcPassword = config.getServletContext().getInitParameter("jdbcPassword");
		System.out.println(jdbcURL + jdbcUsername + jdbcPassword);
		this.loanDao = new LoanDao(jdbcURL, jdbcUsername, jdbcPassword);

	}
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/* read the loan info data from user and insert into database 
		   after inserting redirect to user home page
		*/
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
