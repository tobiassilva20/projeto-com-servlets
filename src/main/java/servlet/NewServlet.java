package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import interfaces.Urls;

@WebServlet("/newServlet")
public class NewServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public NewServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html");
		PrintWriter pw  = response.getWriter();
		pw.write("<p>This servlet uses the @WebServlet annotation.</p>");
		pw.write("<a href='" + Urls.ROOT_URL + "'>Go back</a>");
		System.out.println("Test get request");
		pw.close();
	}
}
