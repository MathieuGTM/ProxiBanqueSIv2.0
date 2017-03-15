package service;

import dao.DaoCompteEpargne;
import dao.DaoService;
import dao.IdaoCompteEpargne;
import metier.CompteEpargne;
import metier.Compte;

public class ServiceCompteEpargne implements IserviceCompteEpargne {
	IdaoCompteEpargne daoCompteEpargne = new DaoCompteEpargne();

	@Override
	public void ajouterCompteEpargne(CompteEpargne ce) {
		daoCompteEpargne.insertCompteEpargne(ce, DaoService.cnx);
	}

	@Override
	public void supprimerCompteEpargneById(int id) {
		daoCompteEpargne.deleteCompteEpargne(DaoService.cnx, id);
	}

	@Override
	public void modifTauxCompteEpargne(int idCompteEpargne, double newTaux) {
		daoCompteEpargne.updateCompteTaux(DaoService.cnx, idCompteEpargne, newTaux);
	}

	@Override
	public void modifSoldeCompte(int idCompte, double newSolde) {
		daoCompteEpargne.updateCompteSolde(DaoService.cnx, idCompte, newSolde);

	}




	
	public void virement (double montant, Compte comptedebiteur, Compte compteDestinataire  ){
		double soldeCourant1= comptedebiteur.getSolde();
		double soldeCourant2 = compteDestinataire.getSolde();
		if (comptedebiteur.getSolde() > montant){
			
			
			soldeCourant1 = soldeCourant1 - montant;
			
			
			
			soldeCourant2 = soldeCourant2 + montant;
			
			
			modifSoldeCompte(comptedebiteur.idCompte, soldeCourant1 );
			modifSoldeCompte(compteDestinataire.idCompte, soldeCourant2);
		} 
		
		else{
			System.out.println("Impossible d'effectuer le virement, veuillez saisir un antre montant inferieur à "+ soldeCourant1);
		}
	}

	
	
}
