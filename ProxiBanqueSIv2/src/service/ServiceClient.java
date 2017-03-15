package service;

import java.util.Collection;

import dao.*;
import metier.*;



/**
 * La classe ServiceClient implémente l'interface IServiceClient et détaille les méthodes signées dans l'interface
 * @author adminl
 */

public class ServiceClient implements IServiceClient {

	
	IDaoClient daoClient = new DaoClient();
	
	
	@Override
	public void ajouterClient(Client c) {
		daoClient.addClient(c, DaoService.cnx);
	}

	@Override
	public void supprimerClientByName(String name) {
		daoClient.deleteClientByName(DaoService.cnx, name);
	}

	@Override
	public void supprimerClientById(int id) {
		daoClient.deleteClientById(DaoService.cnx, id);
	}

	@Override
	public void voirClient(String name) {
		daoClient.selectIdbyName(DaoService.cnx, name);
	}

	@Override
	public Client voirClientById(int id) {
		Client client = daoClient.selectClientById(DaoService.cnx, id);
		return client;
	}

	@Override
	public Collection<Client> voirTousClients() {
		Collection<Client> listClient = daoClient.selectAllClient(DaoService.cnx);
		return listClient;
	}

	@Override
	public void modifNom(String nom, int idClient) {
		daoClient.updateClientNom(DaoService.cnx, idClient, nom);   //TODO !!! ne comprend pas d'ou vient l'idClient
	}

	@Override
	public void modifPrenom(String prenom, int idClient) {
		daoClient.updateClientPrenom(DaoService.cnx, idClient, prenom);   //TODO !!! ne comprend pas d'ou vient l'idClient

	}

	@Override
	public void modifEmail(String email, int idClient) {
		daoClient.updateClientEmail(DaoService.cnx, idClient, email);   //TODO !!! ne comprend pas d'ou vient l'idClient

	}

	@Override
	public void modifAdress(String adress, int idClient) {
		daoClient.updateClientAdresse(DaoService.cnx, idClient, adress);   //TODO !!! ne comprend pas d'ou vient l'idClient

	}

	@Override
	public void modifVille(String ville, int idClient) {
		daoClient.updateClientVille(DaoService.cnx, idClient, ville);   //TODO !!! ne comprend pas d'ou vient l'idClient

	}

	@Override
	public void modifCp(int cp, int idClient) {
		daoClient.updateClientCp(DaoService.cnx, idClient, cp);   //TODO !!! ne comprend pas d'ou vient l'idClient
	}

	@Override
	public void virement(Compte compteADebiter, Compte compteACrediter) {
		// TODO 
		
	}

}
