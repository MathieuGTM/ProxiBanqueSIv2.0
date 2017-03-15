package dao;

import java.sql.Connection;
import java.util.Collection;

import metier.Client;

/**
 * @author AMM
 * L'interface IDaoClient signe les méthodes relatives au client de la banque : 
 * ainsi le conseiller peut : ajouter un client dans la bdd, en supprimer un, le mettre à jour
 * et afficher les infos du client.
 */
public interface IDaoClient {
	
	/**
	 * méthode qui créé un client dans la base de données 
	 *
	 */
	 public void addClient(Client client, Connection cnx);
	 
	 
	 /**
	  * 
	  * méthode qui supprime un client de la bdd
	  */
	 public void deleteClientById(Connection cnx, int idClient);
	 
	 
	 /**
	  * 
	  * méthode qui supprime un client par son ID
	  */
	 public void deleteClientByName(Connection cnx, String name);
	 
	 
	 
	 
	 /**
	  * 
	  * méthode qui met à jour le nom du client
	  */
	 public void updateClientNom(Connection cnx, int idClient, String newName);
	 /**
	  * 
	  * méthode qui met à jour le prénom du client
	  */
	 public void updateClientPrenom(Connection cnx, int idClient, String newPrenom);
	 /**
	  * 
	  * méthode qui met à jour l'email du client
	  */
	 public void updateClientEmail(Connection cnx, int idClient, String newEmail);
	 /**
	  * 
	  * méthode qui met à jour l'adresse du client
	  */
	 public void updateClientAdresse(Connection cnx, int idClient, String newAdresse);
	 /**
	  * 
	  * méthode qui met à jour la ville du client
	  */
	 public void updateClientVille(Connection cnx, int idClient, String newVille);
	 /**
	  * 
	  * méthode qui met à jour le code postal du client
	  */
	 public void updateClientCp(Connection cnx, int idClient, int newCp) ;

	 
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
	 
	 public Client selectClientById(Connection cnx, int idClient);

	

	
	
	
	
}
