package it.gennaro;

import java.io.File;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class Main {

	public static void main(String[] args) {
		
		
		Tomcat connessione = new Tomcat();
		
		connessione.setPort(8080);
		
		   Context ctx = connessione.addContext("/LoginServlet", new File(".").getAbsolutePath());
		  Context ctx2 = connessione.addContext("/connessione", new File(".").getAbsolutePath());
	      SecondaServlet primaServlet = new SecondaServlet();
	     LoginServlet login = new LoginServlet();
	      
	        Tomcat.addServlet(ctx, "LoginServlet", primaServlet);
	       Tomcat.addServlet(ctx2, "connessione", login);
	     
	       ctx.addServletMapping("/*", "LoginServlet");
	       ctx2.addServletMapping("/*", "connessione");
	        try {
				connessione.start();
			} catch (LifecycleException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	       connessione.getServer().await();
		}

	}


