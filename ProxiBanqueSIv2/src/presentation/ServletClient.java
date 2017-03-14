package presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import java.sql.Connection;

import dao.DaoClient;
import dao.DaoService;
import dao.IDaoClient;

/**
 * Servlet implementation class ServletClient
 */
@WebServlet("/ServletClient")
public class ServletClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Connection cnx = DaoService.SeConnecter();
	IDaoClient daoclient = new DaoClient();
	
	

    /**
     * Default constructor. 
     */
    public ServletClient() {
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
	 * Cette m�thode r�cup�re les param�tres du formulaire  des donn�es d'un client : 
	 * nom, prenom, email, adresse, ville et CP
	 * puis les modifie selon ce qu'a rentr� le conseiller
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idClient = request.getParameter("idClient");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String adresse = request.getParameter("adresse");
		String ville = request.getParameter("ville");
		String cp = request.getParameter("cp");
		

		// on enl�ve les espaces
		idClient = idClient.trim();
		nom= nom.trim();
		prenom = prenom.trim();
		email = email.trim();
		adresse = adresse.trim();
		ville = ville.trim();
		cp = cp.trim();
		
		// on modifie les donn�es voulues du client
		if (nom.isEmpty()) {
			System.out.println("\nLe nom du client n'a pas �t� modifi�.");
		} else {
			daoclient.updateClientNom(cnx, idClient, nom);
			System.out.println("Le nom du client a �t� modifi� � : "+ nom);
		}
		
		if (prenom.isEmpty()) {
			System.out.println("\nLe pr�nom du client n'a pas �t� modifi�.");
		} else {
			daoclient.updateClientPrenom(cnx, idClient, prenom);
			System.out.println("Le pr�nom du client a �t� modifi� � : "+ prenom);
		}
		
		if (email.isEmpty()) {
			System.out.println("\nL'email du client n'a pas �t� modifi�.");
		} else {
			daoclient.updateClientEmail(cnx, idClient, email);
			System.out.println("L'email du client a �t� modifi� � : "+ email);
		}
		
		if (adresse.isEmpty()) {
			System.out.println("\nL'adresse du client n'a pas �t� modifi�.");
		} else {
			daoclient.updateClientAdresse(cnx, idClient, adresse);
			System.out.println("L'adresse du client a �t� modifi� � : "+ adresse);
		}
		
		if (ville.isEmpty()) {
			System.out.println("\nLa ville du client n'a pas �t� modifi�.");
		} else {
			daoclient.updateClientVille(cnx, idClient, ville);
			System.out.println("La ville du client a �t� modifi� � : "+ ville);
		}
		
		if (cp.isEmpty()) {
			System.out.println("\nLe code postal du client n'a pas �t� modifi�.");
		} else {
			daoclient.updateClientCp(cnx, idClient, cp);
			System.out.println("Le code postal du client a �t� modifi� � : "+ cp);
		}
		
		
	}

}

/*
String numDept = request.getParameter("DeptNum");
numDept = numDept.trim();
String nameDept = deptNumMapper.findDept(numDept);

DeptPair paire = new DeptPair(numDept,nameDept);

HttpSession maSession = request.getSession();
maSession.setAttribute("deptInfo1", paire);
//request.setAttribute("deptInfo1", paire);

RequestDispatcher dispatcher;

if(numDept.isEmpty()) {
	String adress = "WEB-INF/results/missing-num.jsp";
	dispatcher = request.getRequestDispatcher(adress);
} else if (nameDept != null) {
	String adress = "WEB-INF/results/show-department-1.jsp";
	dispatcher = request.getRequestDispatcher(adress);

} else {
	String adress = "WEB-INF/results/unknown-num-1.jsp";
	dispatcher = request.getRequestDispatcher(adress);

}
dispatcher.forward(request, response);

}
*/
