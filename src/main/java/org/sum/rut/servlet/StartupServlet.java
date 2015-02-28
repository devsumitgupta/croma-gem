package org.sum.rut.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sum.rut.utils.FileReadUtils;

/**
 * Servlet implementation class StartupServlet
 */
public class StartupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public Properties configProps = null;

    /**
     * Default constructor. 
     */
    public StartupServlet() {
        // TODO Auto-generated constructor stub
    }

/*	*//**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 *//*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		pw.write("Testin it " );
		pw.flush();
		
	}*/
	
	
	/* (non-Javadoc)
	 * @see javax.servlet.GenericServlet#init(javax.servlet.ServletConfig)
	 */
	public void init(ServletConfig sc) {
//		String xml sc.getInitParameter();
		String config = sc.getInitParameter("config");
		loadConfigData(config);
	}

	private void loadConfigData(String configfile) {
		System.out.println("Loading Config File ");
		if(FileReadUtils.doesFileExist(configfile)) {
			System.out.println("File Exist");
			configProps = FileReadUtils.readProperty(configfile);
		}
		System.out.println("Config file loaded");
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
