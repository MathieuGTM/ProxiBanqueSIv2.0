package service;

import java.util.Collection;
import metier.*;

public interface IServiceClient {

	public void addClient(Client c);
	
	public void removeClient(Client c);
	public void removeClientById(int id);
	
	public void getClient(Client c);
	public Client getClientById(int id);  //type retour void???
	public Collection<Client> getAllClients();
	
	public void updateNom(String n);
	public void updatePrenom(String p);
	public void updateEmail(String e);
	public void updateAdress(String a);
	public void updateVille(String v);
	public void updateCp(int cp);

	public void virement(Compte compteADebiter, Compte compteACrediter);  // rajouter en entrée les clients ??

	
}
