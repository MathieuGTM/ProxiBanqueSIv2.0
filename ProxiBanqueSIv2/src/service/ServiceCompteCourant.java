package service;

import dao.DaoCompteCourant;

import dao.DaoService;
import dao.IDaoCompteCourant;
import metier.Compte;
import metier.CompteCourant;

public class ServiceCompteCourant implements IserviceCompteCourant {

	IDaoCompteCourant daoCompteCourant = new DaoCompteCourant();

	@Override
	public void ajouterCompteCourant(CompteCourant cc) {
		daoCompteCourant.insertCompteCourant(cc, DaoService.cnx);
	}

	@Override
	public void supprimerCompteCourantById(int id) {
		daoCompteCourant.deleteCompteCourant(DaoService.cnx, id);
	}


	@Override
	public void modifDecouvertCompteCourant(int idCompteCourant, double newDecouvert) {
		daoCompteCourant.updateCompteDecouvert(DaoService.cnx, idCompteCourant, newDecouvert);
	}

	@Override
	public void modifSoldeCompte(int idCompteCourant, double newSolde) {
		daoCompteCourant.updateCompteSolde(DaoService.cnx, idCompteCourant, newSolde);

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
			System.out.println("Impossible d'effectuer le virement, veuillez saisir un autre montant inferieur à "+ soldeCourant1);
		}
	}

	

}
