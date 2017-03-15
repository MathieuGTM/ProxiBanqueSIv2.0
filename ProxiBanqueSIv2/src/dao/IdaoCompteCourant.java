package dao;

import java.sql.Connection;

import metier.CompteCourant;

public interface IDaoCompteCourant {
	public void insertCompteCourant(CompteCourant compte_courant, Connection cnx);

	public void updateCompteDecouvert(Connection cnx, String idCompte, String newDecouvert);

	public void updateClientSolde(Connection cnx, String idClient, String newSolde);

	public void deleteCompteCourant(Connection cnx, String idCompte);

	public int selectIdComptebyName(Connection cnx, String name);

}
