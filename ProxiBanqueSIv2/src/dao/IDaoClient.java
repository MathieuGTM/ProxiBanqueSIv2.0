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
	 * méthode qui créé un client 
	 *
	 */
	 public void insertClient(Client client, Connection cnx);
	 
	 /**
	  * 
	  * méthode qui met à jour le nom du client
	  */
	 public void updateClientNom(Connection cnx, String idClient, String newName);
	 /**
	  * 
	  * méthode qui met à jour le prénom du client
	  */
	 public void updateClientPrenom(Connection cnx, String idClient, String newPrenom);
	 /**
	  * 
	  * méthode qui met à jour l'email du client
	  */
	 public void updateClientEmail(Connection cnx, String idClient, String newEmail);
	 /**
	  * 
	  * méthode qui met à jour l'adresse du client
	  */
	 public void updateClientAdresse(Connection cnx, String idClient, String newAdresse);
	 /**
	  * 
	  * méthode qui met à jour la ville du client
	  */
	 public void updateClientVille(Connection cnx, String idClient, String newVille);
	 /**
	  * 
	  * méthode qui met à jour le code postal du client
	  */
	 public void updateClientCp(Connection cnx, String idClient, String newCp) ;
	 
	 /**
	  * 
	  * méthode qui supprime un client
	  */
	 public void deleteClient(Connection cnx, String idClient);
	 
	 /**
	  * 
	  * méthode qui affiche la liste de tous les clients
	  */
	 public Collection<Client> selectAllClient(Connection cnx);
	 
	 /**
	  * 
	  * méthode qui affiche un client par son ID
	  */
	 public int selectIdbyName(Connection cnx, String name) ;

	

	
	
	
	
}
