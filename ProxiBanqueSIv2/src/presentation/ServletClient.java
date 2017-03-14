package presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.formation.jsp.DeptPair;

/**
 * Servlet implementation class ServletClient
 */
@WebServlet("/ServletClient")
public class ServletClient extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
	 * Cette méthode récupère les paramètres du formulaire  des données d'un client : 
	 * nom, prenom, email, adresse, ville et CP
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String adresse = request.getParameter("adresse");
		String ville = request.getParameter("ville");
		String cp = request.getParameter("cp");
		
		

		// on enlève les espaces
		nom= nom.trim();
		prenom = prenom.trim();
		email = email.trim();
		adresse = adresse.trim();
		ville = ville.trim();
		cp = cp.trim();
		
		if (nom.isEmpty()) {
			// on ne fait rien
		} else {
			UpdateClientNom(cnx, )
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
