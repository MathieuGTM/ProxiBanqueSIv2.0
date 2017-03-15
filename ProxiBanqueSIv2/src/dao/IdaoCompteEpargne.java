package dao;

import java.sql.Connection;

import metier.CompteEpargne;

public interface IdaoCompteEpargne {

	public void insertCompteEpargne(CompteEpargne compteepargne, Connection cnx);

	public void updateCompteTaux(Connection cnx, int idCompteEpargne, double newTaux);

	public void updateCompteEpargneSolde(Connection cnx, int idCompte, double newSolde);

	public void deleteCompteEpargne(Connection cnx, int idCompteEpargne);

	public int selectIdComptebyName(Connection cnx, String name);

}
