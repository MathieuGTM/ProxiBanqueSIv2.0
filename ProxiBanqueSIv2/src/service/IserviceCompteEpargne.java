package service;

import metier.Compte;
import metier.CompteEpargne;


/**
 * @author AMM
 * L'interface IDaoCompteEpargne signe les méthodes relatives aux comtpes epargne (CE) des clients de la banque : 
 * ainsi le conseiller peut : ajouter un CE, supprimer un CE, modifier le taux, modifier le 
 * solde et afficher un CE .
 */

public interface IserviceCompteEpargne {

	public void ajouterCompteEpargne(CompteEpargne ce);

	public void supprimerCompteEpargneById(int id);


	public void modifTauxCompteEpargne(int idCompteEpargne, double newTaux);

	public void virement (double montant, Compte comptedebiteur, Compte compteDestinataire  );


	public void modifSoldeCompte(int idCompteEpargne, double newSolde);

}
