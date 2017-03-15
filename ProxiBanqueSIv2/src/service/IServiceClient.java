package service;

import java.util.Collection;
import metier.*;

/**
 * @author AMM
 * L'interface IServiceClient signe les méthodes relatives au client de la banque : 
 * ainsi le conseiller peut : ajouter un client dans la bdd, en supprimer un, le mettre à jour
 * et afficher les infos du client.
 * Tout ceci via les méthodes de dao.
 */

public interface IServiceClient {

	public void ajouterClient(Client c);
	
	public void supprimerClientByName(String name);
	public void supprimerClientById(int id);
	
	public void voirClient(String name);
	public Client voirClientById(int id);  
	public Collection<Client> voirTousClients();
	
	public void modifNom(String n, int idClient);
	public void modifPrenom(String p, int idClient);
	public void modifEmail(String e, int idClient);
	public void modifAdress(String a, int idClient);
	public void modifVille(String v, int idClient);
	public void modifCp(int cp, int idClient);

	public void virement(Compte compteADebiter, Compte compteACrediter);  // rajouter en entrée les clients ??

	
}
