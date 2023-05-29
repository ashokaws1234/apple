package rd_sd;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/demo")
public class Demo extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
	resp.getWriter().print("<h1> Hello this is demo");
	
//	req.getRequestDispatcher("Myhtml.html").include(req, resp);
//	req.getRequestDispatcher("index.jsp").include(req, resp);
	req.getRequestDispatcher("sample").forward(req, resp);
	req.setAttribute("a","sb");
	}
	

}
