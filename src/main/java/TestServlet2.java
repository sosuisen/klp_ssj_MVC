import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CountBean;
import model.Counter;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/test2")
public class TestServlet2 extends HttpServlet {
	private Counter counter = new Counter();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String count = request.getParameter("count");

		response.setContentType("text/html; charset=UTF-8");

		CountBean countBean = new CountBean();
		countBean.setCount(Integer.parseInt(count));
		counter.execute(countBean);
		
		request.setAttribute("countBean", countBean);
		request.getRequestDispatcher("/hello2.jsp").forward(request, response);
	}
}
