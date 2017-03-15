package service;

import metier.CompteEpargne;

public interface IserviceCompteEpargne {

	public void ajouterCompteEpargne(CompteEpargne ce);

	void supprimerCompteEpargneById(int id);

	void voirCompteEpargne(String name);

	void modifTauxCompteEpargne(int idCompteEpargne, double newTaux);

	void modifSoldeCompteEpargne(int idCompteEpargne, double newSolde);

}
