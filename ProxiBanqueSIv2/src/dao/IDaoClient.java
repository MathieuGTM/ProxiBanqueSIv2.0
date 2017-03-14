package dao;

import java.sql.Connection;
import java.util.Collection;

import metier.Client;

/**
 * @author adminl
 *
 */
public interface IDaoClient {
	
	/**
	 * m�thode qui cr�� un client 
	 *
	 */
	 public void addClient(Client client, Connection cnx);
	 
	 
	 /**
	  * 
	  * m�thode qui supprime un client
	  */
	 public void deleteClientById(Connection cnx, int idClient);
	 
	 
	 /**
	  * 
	  * m�thode qui supprime un client par son ID
	  */
	 public void deleteClientByName(Connection cnx, String name);
	 
	 
	 
	 
	 /**
	  * 
	  * m�thode qui met � jour le nom du client
	  */
	 public void updateClientNom(Connection cnx, int idClient, String newName);
	 /**
	  * 
	  * m�thode qui met � jour le pr�nom du client
	  */
	 public void updateClientPrenom(Connection cnx, int idClient, String newPrenom);
	 /**
	  * 
	  * m�thode qui met � jour l'email du client
	  */
	 public void updateClientEmail(Connection cnx, int idClient, String newEmail);
	 /**
	  * 
	  * m�thode qui met � jour l'adresse du client
	  */
	 public void updateClientAdresse(Connection cnx, int idClient, String newAdresse);
	 /**
	  * 
	  * m�thode qui met � jour la ville du client
	  */
	 public void updateClientVille(Connection cnx, int idClient, String newVille);
	 /**
	  * 
	  * m�thode qui met � jour le code postal du client
	  */
	 public void updateClientCp(Connection cnx, int idClient, int newCp) ;

	 
	 /**
	  * 
	  * m�thode qui affiche la liste de tous les clients
	  */
	 public Collection<Client> selectAllClient(Connection cnx);
	 
	 /**
	  * 
	  * m�thode qui affiche un client par son ID
	  */
	 public int selectIdbyName(Connection cnx, String name) ;
	 
	 public Client selectClientById(Connection cnx, int idClient);

	

	
	
	
	
}
