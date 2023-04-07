import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/calc.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramA = request.getParameter("paramA");
		String paramB = request.getParameter("paramB");

		int numberA = Integer.parseInt(paramA);
		int numberB = Integer.parseInt(paramB);
			
		int add = numberA + numberB;
		int sub = numberA - numberB;
		int mul = numberA * numberB;
		double div = (double)numberA / (double)numberB;
		request.setAttribute("add", add);
		request.setAttribute("sub", sub);
		request.setAttribute("mul", mul);
		request.setAttribute("div", div);

		response.setContentType("text/html; charset=UTF-8");
		request.getRequestDispatcher("/WEB-INF/calc.jsp").forward(request, response);
	}

}
