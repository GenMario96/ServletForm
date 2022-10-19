package it.gennaro;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondaServlet extends HttpServlet {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        
		
		
        Writer w = resp.getWriter();
	
	
	w.write("<html>"
			+ "<form name=\"loginForm\" method=\"post\" action=\"connessione\">\r\n"
			+ "    Username: <input type=\"text\" name=\"username\"/> <br/>\r\n"
			+ "    Password: <input type=\"password\" name=\"password\"/> <br/>\r\n"
			+ "    <input type=\"submit\" value=\"Login\" />\r\n"
			+ "</form>"
			+ "</html>");
	
	
	
	
	}
	
}
