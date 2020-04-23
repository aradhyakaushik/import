package jsp;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() of Test");
	}

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String fname = req.getParameter("fname");
		if (fname == null || fname.trim().length() == 0) {
			fname = "Guest";
			req.setAttribute("NM", fname);
			req.getRequestDispatcher("Show.jsp").forward(req, res);
			System.out.println("service() of Test");
		}
	}
}
