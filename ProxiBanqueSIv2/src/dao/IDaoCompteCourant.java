package dao;

import java.sql.Connection;

import metier.CompteCourant;

/**
 * @author AMM
 * L'interface IDaoCompteCourant signe les m�thodes relatives aux comtpes courant (CC) des clients de la banque : 
 * ainsi le conseiller peut : ajouter un CC, supprimer un CC, modifier le d�couvert autoris�, modifier le 
 * solde et afficher un CC .
 */
public interface IDaoCompteCourant {
	/**
	 * m�thode qui cr�� un CC dans la base de donn�es 
	 *
	 */
	public void insertCompteCourant(CompteCourant comptecourant, Connection cnx);
	/**
	 * m�thode qui met � jour le d�couvert autoris� du CC dans la base de donn�es 
	 *
	 */
	public void updateCompteDecouvert(Connection cnx, int idCompte, double newDecouvert);

	/**
	 * m�thode qui met � jour le solde du compte dans la base de donn�es 
	 *
	 */
	public void updateCompteSolde(Connection cnx, int idCompte, double newSolde);
	/**
	 * m�thode qui supprimer un CC dans la base de donn�es 
	 *
	 */
	public  void deleteCompteCourant(Connection cnx, int idCompte);

	

}
