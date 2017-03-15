package dao;

import java.sql.Connection;

import metier.CompteCourant;


public interface IDaoCompteCourant {

	public void updateCompteDecouvert(Connection cnx, int idCompte, int newDecouvert);

	public void updateClientSolde(Connection cnx, int idClient, int newSolde);

	public void deleteCompteCourant(Connection cnx, int idCompte);

	public int selectIdComptebyName(Connection cnx, String name);

	public void insertCompteCourant(CompteCourant comptecourant, Connection cnx);

}
