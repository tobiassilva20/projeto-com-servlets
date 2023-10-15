package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import interfaces.Urls;

@WebServlet(name="Register Servlet", urlPatterns = ("/save"))
public class RegisterServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		writer.print("Here are your informations:");
		//writer.print("<br>");
		writer.print("<p>Name: " + request.getParameter("name")+ "</p>");
		writer.print("<br>");
		writer.print("<p>Email: " + request.getParameter("email")+ "</p>");
		writer.print("<br>");
		writer.print("<p>Age: " + request.getParameter("age")+ "</p>");
		writer.print("<br>");
		writer.print("<p>Gender: " + request.getParameter("gender")+ "</p>");
		writer.print("<a href='"+ Urls.ROOT_URL+ "'>Go back</a>");
	}
	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
//		System.out.println(request.getParameter("name"));
//	}
}
