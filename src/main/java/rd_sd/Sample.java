package rd_sd;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sample")
public class Sample extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().print("<h1> Hello this is sample servlet");
//		req.getRequestDispatcher("Myhtml.html").include(req, resp);
		
//		resp.sendRedirect("https://www.youtube.com");
		req.getRequestDispatcher("Loginpage.html").include(req, resp);
	}
}