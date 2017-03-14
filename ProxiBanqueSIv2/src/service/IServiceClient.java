package service;

import java.util.Collection;
import metier.*;

public interface IServiceClient {

	public void ajouterClient(Client c);
	
	public void supprimerClient(Client c);
	public void supprimerClientById(int id);
	
	public void voirClient(Client c);
	public Client voirClientById(int id);  //type retour void???
	public Collection<Client> voirTousClients();
	
	public void modifNom(String n);
	public void modifPrenom(String p);
	public void modifEmail(String e);
	public void modifAdress(String a);
	public void modifVille(String v);
	public void modifCp(int cp);

	public void virement(Compte compteADebiter, Compte compteACrediter);  // rajouter en entrée les clients ??

	
}
