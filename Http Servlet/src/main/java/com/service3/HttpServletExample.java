package com.service3;
import java.io.IOException;
import java.io.PrintWriter;

//import javax.servlet.*;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class HttpServletExample extends HttpServlet{  
	public void service(HttpServletRequest req,HttpServletResponse res)  
			throws IOException,ServletException{  
			  
			res.setContentType("text/html");  
			  
			PrintWriter out=res.getWriter();  
			out.print("<html><body>");  
			out.print("<b>Servlet by inherting HttpServlet Class</b>");  
			out.println("<a href='Home.html'><br>Home page</b></a>");
			out.print("</body></html>");  
			  
			}  
			}