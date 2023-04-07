import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/calc.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String strX = request.getParameter("x");
		String strY = request.getParameter("y");

		int x = Integer.parseInt(strX);
		int y = Integer.parseInt(strY);

		request.setAttribute("add", x + y);
		request.setAttribute("sub", x - y);
		request.setAttribute("mul", x * y);
		request.setAttribute("div", (double) x / (double) y);

		response.setContentType("text/html; charset=UTF-8");
		request.getRequestDispatcher("/WEB-INF/calc.jsp").forward(request, response);
	}

}
