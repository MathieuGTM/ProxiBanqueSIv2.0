package service;

import metier.Compte;
import metier.CompteCourant;

public interface IserviceCompteCourant {

	public void ajouterCompteCourant(CompteCourant cc);

	public void supprimerCompteCourantById(int id);

	public void voirCompteCourant(String name);

	public void modifSoldeCompte(int idCompteEpargne, double newSolde);

	public void modifDecouvertCompteCourant(int idCompteCourant, double newDecouvert);
	public void virement (double montant, Compte comptedebiteur, Compte compteDestinataire);
	
}
