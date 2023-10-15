package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import interfaces.Urls;

@WebServlet("")
public class RootServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	public RootServlet(){
		super();
	}
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		super.service(req, resp);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter printWriter = response.getWriter();

		response.setContentType("text/html");
		printWriter.write("Try one of the links bellow to test the other servlets:");
		printWriter.write("<ul>");
		printWriter.write("<li>");
		printWriter.write("<a href='" + Urls.ROOT_URL + "/hello'>Hello Servlet </a>");
		printWriter.write("</li>");
		printWriter.write("<li>");
		printWriter.write("<a href='" + Urls.ROOT_URL + "/newServlet'>New Servlet </a>");
		printWriter.write("</li>");
		printWriter.write("<li>");
		printWriter.write("<a href='" + Urls.ROOT_URL + "/form'>Form Servlet </a>");
		printWriter.write("</li>");
		printWriter.write("</ul>");
	}
}
