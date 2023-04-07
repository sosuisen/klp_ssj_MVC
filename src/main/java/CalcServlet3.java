import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Calculator;
import model.FormulaBean;

@WebServlet("/calc3")
public class CalcServlet3 extends HttpServlet {
	private Calculator calculator = new Calculator();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		FormulaBean fb = new FormulaBean();
		request.setAttribute("formulaBean", fb);

		request.getRequestDispatcher("/WEB-INF/calc3.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String x = request.getParameter("x");
		String y = request.getParameter("y");

		FormulaBean formulaBean = new FormulaBean();
		formulaBean.setX(x);
		formulaBean.setY(y);
		calculator.calc(formulaBean);

		request.setAttribute("formulaBean", formulaBean);

		request.getRequestDispatcher("/WEB-INF/calc3.jsp").forward(request, response);
	}

}
