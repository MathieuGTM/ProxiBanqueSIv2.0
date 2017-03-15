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
	public void voirCompteEpargne(String name) {
		daoCompteEpargne.selectIdComptebyName(DaoService.cnx, name);
	}

	@Override
	public void modifTauxCompteEpargne(int idCompteEpargne, double newTaux) {
		daoCompteEpargne.updateCompteTaux(DaoService.cnx, idCompteEpargne, newTaux);
	}

	@Override
	public void modifSoldeCompteEpargne(int idCompteEpargne, double newSolde) {
		daoCompteEpargne.updateCompteEpargneSolde(DaoService.cnx, idCompteEpargne, newSolde);

	}

}
