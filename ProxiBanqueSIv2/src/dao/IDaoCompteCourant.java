package dao;

import java.sql.Connection;

import metier.CompteCourant;

/**
 * @author AMM
 * L'interface IDaoCompteCourant signe les méthodes relatives aux comtpes courant (CC) des clients de la banque : 
 * ainsi le conseiller peut : ajouter un CC, supprimer un CC, modifier le découvert autorisé, modifier le 
 * solde et afficher un CC .
 */
public interface IDaoCompteCourant {
	/**
	 * méthode qui créé un CC dans la base de données 
	 *
	 */
	public void insertCompteCourant(CompteCourant comptecourant, Connection cnx);
	/**
	 * méthode qui met à jour le découvert autorisé du CC dans la base de données 
	 *
	 */
	public void updateCompteDecouvert(Connection cnx, int idCompte, double newDecouvert);

	/**
	 * méthode qui met à jour le solde du compte dans la base de données 
	 *
	 */
	public void updateCompteSolde(Connection cnx, int idCompte, double newSolde);
	/**
	 * méthode qui supprimer un CC dans la base de données 
	 *
	 */
	public  void deleteCompteCourant(Connection cnx, int idCompte);

	

}
