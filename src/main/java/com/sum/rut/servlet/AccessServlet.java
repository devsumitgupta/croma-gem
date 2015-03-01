package com.sum.rut.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.sum.rut.utils.LoggerUtil;

/**
 * Servlet implementation class AccessServlet
 */
public class AccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Logger debug = LogManager.getLogger("debug");
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		debug.debug("Welcome to the world");
		PrintWriter pw = response.getWriter();
		pw.write("Hello World");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
