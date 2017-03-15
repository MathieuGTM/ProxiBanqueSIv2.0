package presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import metier.Client;
import metier.Conseiller;
import service.IServiceClient;
import service.ServiceClient;

/**
 * Servlet implementation class ServletLogin
 * Permet de créer un nouveau client dans la base de données en partant du formulaire de 
 * l'application.
 */
@WebServlet("/NouveauClient")
public class ServletNewClient extends HttpServlet {
	private static final long serialVersionUID = 1L;

	IServiceClient servClient = new ServiceClient();

	
	
    /**
     * Default constructor. 
     */
    public ServletNewClient() {
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

		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		String email=request.getParameter("email");
		String adresse=request.getParameter("adresse");
		String ville=request.getParameter("ville");
		int cp= Integer.parseInt(request.getParameter("codepostal"));
		
		HttpSession maSession = request.getSession();
		Client client = new Client(nom, prenom,email, adresse, ville,cp );
		maSession.setAttribute("client", client);
		
		servClient.ajouterClient(client);
			
		
		Collection<Client> listeTousClients = servClient.voirTousClients();
		maSession.setAttribute("listClient", listeTousClients);
	
		RequestDispatcher dispatcher;
		dispatcher = request.getRequestDispatcher("ClientCree.jsp");	
		dispatcher.forward(request, response);
		}
		
		
		
	

}
