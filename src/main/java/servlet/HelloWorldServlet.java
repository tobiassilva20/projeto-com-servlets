package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import interfaces.Urls;

/**
 * Servlet implementation class Hello
 */

public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorldServlet() {
        super();
        System.out.println("Constructor");
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(request, response);
		System.out.println("Service");
	}
	
	protected void doGet(HttpServletRequest requestData, HttpServletResponse responseData) throws ServletException, IOException {
		System.out.println("Do get");
		responseData.setContentType("text/html");
		PrintWriter writer = responseData.getWriter();
		writer.print("This prints Hello World!");

		writer.print("<p>");

		writer.print("Lorem ipsum dolor sit amet. Qui dolorem maiores et natus quibusdam "
				+ "et earum mollitia et mollitia ducimus. Qui adipisci debitis At eligendi "
				+ "nesciunt aut autem rerum. Aut recusandae ducimus ut molestiae temporibus "
				+ "sed reiciendis accusantium et unde incidunt cum dolorem necessitatibus aut "
				+ "blanditiis omnis ab nesciunt quia. Ut voluptatem iure et cupiditate error ex "
				+ "consequatur optio et quam sint."); 
		writer.print("</p>");
		writer.print("<a href='" + Urls.ROOT_URL+ "'>Go back</a>");
		writer.close();
	}
	
	protected void doPost(HttpServletRequest requestData, HttpServletResponse responseData) throws ServletException, IOException {
		
	}
}
