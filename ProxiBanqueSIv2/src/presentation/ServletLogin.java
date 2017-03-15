package presentation;

import java.io.IOException;
import java.sql.Connection;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import dao.DaoService;
import metier.Client;
import metier.Conseiller;
import service.IServiceClient;
import service.ServiceClient;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/LoginPage")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection cnx = DaoService.SeConnecter();
	IServiceClient servClient = new ServiceClient();

	
	
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
		doPost(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String login=request.getParameter("login");
		String pwd=request.getParameter("pwd");
		
		HttpSession maSession = request.getSession();
		Conseiller conseiller = new Conseiller(login,pwd);
		maSession.setAttribute("conseiller", conseiller);
		
		Collection<Client> listeTousClients = servClient.voirTousClients();
//		int nbClients = listeTousClients.size();
//		String[] listeNomClients = new String[nbClients];
//		int i=0; //compteur de clients
//		for (Client c : listeTousClients) {
//			listeNomClients[i] = c.getNom();
//			
//			
//			i++;
//		}
		
		
		maSession.setAttribute("listClient", listeTousClients);
		
		
		
		
		RequestDispatcher dispatcher;
		
		if (("tintin".equals(login))&&("milou".equals(pwd))) {			
			dispatcher = request.getRequestDispatcher("AccueilConseiller.jsp");	
			
		} else {
			dispatcher = request.getRequestDispatcher("Login.jsp");
			//dispatcher = request.getRequestDispatcher("FailAuthentication.jsp");
		}
		dispatcher.forward(request, response);
		
		
	}

}
