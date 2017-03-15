package dao;

import java.sql.Connection;

import metier.CompteEpargne;

/**
 * @author AMM
 * L'interface IDaoCompteEpargne signe les m�thodes relatives au comptes �pargness des clients de la banque : 
 * ainsi le conseiller peut : ajouter un compte epargne au client, mettre � jour le taux de revenu,
 * mettre � jour le solde pr�sent sur le compte et supprimer un compte �pargne.
 */

public interface IdaoCompteEpargne {

	/**
	 * m�thode qui cr�� un compte �pargne dans la base de donn�es 
	 *
	 */
	public void insertCompteEpargne(CompteEpargne compteepargne, Connection cnx);

	/**
	 * m�thode qui met � jour le taux dans la base de donn�es 
	 *
	 */
	public void updateCompteTaux(Connection cnx, int idCompte, double newTaux);

	/**
	 * m�thode qui met � jour le solde du compte dans la base de donn�es 
	 *
	 */
	public void updateCompteSolde(Connection cnx, int idCompte, double newSolde);

	/**
	 * m�thode qui supprime un compte dans la base de donn�es 
	 *
	 */
	public void deleteCompteEpargne(Connection cnx, int idCompte);


}
