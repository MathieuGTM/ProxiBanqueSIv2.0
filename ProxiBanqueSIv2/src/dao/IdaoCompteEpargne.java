package dao;

import java.sql.Connection;

import metier.CompteEpargne;

/**
 * @author AMM
 * L'interface IDaoCompteEpargne signe les méthodes relatives au comptes épargness des clients de la banque : 
 * ainsi le conseiller peut : ajouter un compte epargne au client, mettre à jour le taux de revenu,
 * mettre à jour le solde présent sur le compte et supprimer un compte épargne.
 */

public interface IdaoCompteEpargne {

	/**
	 * méthode qui créé un compte épargne dans la base de données 
	 *
	 */
	public void insertCompteEpargne(CompteEpargne compteepargne, Connection cnx);

	/**
	 * méthode qui met à jour le taux dans la base de données 
	 *
	 */
	public void updateCompteTaux(Connection cnx, int idCompte, double newTaux);

	/**
	 * méthode qui met à jour le solde du compte dans la base de données 
	 *
	 */
	public void updateCompteSolde(Connection cnx, int idCompte, double newSolde);

	/**
	 * méthode qui supprime un compte dans la base de données 
	 *
	 */
	public void deleteCompteEpargne(Connection cnx, int idCompte);


}
