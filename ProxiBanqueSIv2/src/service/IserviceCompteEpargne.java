package service;

import metier.Compte;
import metier.CompteEpargne;

public interface IserviceCompteEpargne {

	public void ajouterCompteEpargne(CompteEpargne ce);

	public void supprimerCompteEpargneById(int id);


	public void modifTauxCompteEpargne(int idCompteEpargne, double newTaux);

	public void virement (double montant, Compte comptedebiteur, Compte compteDestinataire  );


	public void modifSoldeCompte(int idCompteEpargne, double newSolde);

}
