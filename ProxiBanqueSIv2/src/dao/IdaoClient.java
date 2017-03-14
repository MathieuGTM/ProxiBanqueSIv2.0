package dao;

import java.sql.Connection;
import java.util.Collection;

import metier.Client;

public interface IdaoClient {
	
	 public static void InsertClient(Client client, Connection cnx);
	 public static void UpdateClientNom(Connection cnx, int idClient, String newName);
	 public static void UpdateClientPrenom(Connection cnx, int idClient, String newPrenom);
	 public static void UpdateClientEmail(Connection cnx, int idClient, String newEmail);
	 public static void UpdateClientAdresse(Connection cnx, int idClient, String newAdresse);
	 public static void UpdateClientVille(Connection cnx, int idClient, String newVille);
	 public static void UpdateClientCp(Connection cnx, int idClient, String newCp) ;
	 public static void DeleteClient(Connection cnx);
	 public static Collection<Client> SelectALLClient(Connection cnx);
	 public static int SelectIdbyName(Connection cnx) ;
	
	
	
}
