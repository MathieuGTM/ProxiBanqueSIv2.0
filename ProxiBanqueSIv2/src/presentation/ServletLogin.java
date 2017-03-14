package prez;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/LoginPage")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletLogin() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String login=request.getParameter("login");
		String pwd=request.getParameter("pwd");
		
		HttpSession maSession = request.getSession();
		Internaute internaute = new Internaute(login,pwd); //TODO Creer une classe internaute ?
		maSession.setAttribute("user", internaute);
		RequestDispatcher dispatcher;
		
		if (("tintin".equals(login))&&("milou".equals(pwd))) {
			dispatcher = request.getRequestDispatcher("Accueil.jsp");	
			dispatcher.forward(request, response);
		} else {
			dispatcher = request.getRequestDispatcher("Login.jsp");
			//dispatcher = request.getRequestDispatcher("FailAuthentication.jsp");
		}
		dispatcher.forward(request, response);
		
		
	}

}
