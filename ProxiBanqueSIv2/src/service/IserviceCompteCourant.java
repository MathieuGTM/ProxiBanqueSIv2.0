package service;

import metier.Compte;
import metier.CompteCourant;


/**
 * @author AMM
 * L'interface IserviceCompteCourant signe les méthodes relatives aux comptes courants (CC) des clients de la banque : 
 * ainsi le conseiller peut :  ajouter un CC, supprimer un CC, modifier le découvert autorisé, modifier le 
 * solde et afficher un CC .
 */

public interface IserviceCompteCourant {

	public void ajouterCompteCourant(CompteCourant cc);

	public void supprimerCompteCourantById(int id);


	public void modifSoldeCompte(int idCompteEpargne, double newSolde);

	public void modifDecouvertCompteCourant(int idCompteCourant, double newDecouvert);
	public void virement (double montant, Compte comptedebiteur, Compte compteDestinataire);
	
}
