package dao;

import java.sql.Connection;

import metier.CompteCourant;


public interface IDaoCompteCourant {
	public void insertCompteCourant(CompteCourant comptecourant, Connection cnx);
	public void updateCompteDecouvert(Connection cnx, int idCompte, double newDecouvert);

	public void updateCompteSolde(Connection cnx, int idCompte, double newSolde);
	public  void deleteCompteCourant(Connection cnx, int idCompte);
	public  int selectIdComptebyName(Connection cnx, String name);



	

}
