package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import metier.CompteCourant;

/**
 * La classe DaoCompteCourant implémente l'interface IDaoCompteCourant et
 * détaille les méthodes signées dans l'interface
 * 
 * @author AMM
 */
public class DaoCompteCourant implements IDaoCompteCourant {

	@Override
	public void insertCompteCourant(CompteCourant comptecourant, Connection cnx) {
		String sql = "insert into comptesbdd (solde, datecreation) values (?,?)";

		try {
			PreparedStatement pstat = cnx.prepareStatement(sql);
			pstat.setDouble(1, comptecourant.getSolde());
			pstat.setString(2, comptecourant.getDateCreation());

			pstat.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void updateCompteDecouvert(Connection cnx, int idCompte, double newDecouvert) {

		String sql = "update comptesbdd set decouvert = ?  where idcompte= ?";
		try {
			PreparedStatement stat = cnx.prepareStatement(sql);
			stat.setDouble(1, newDecouvert);
			stat.setInt(2, idCompte);
			stat.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void updateCompteSolde(Connection cnx, int idCompte, double newSolde) {

		String sql = "update comptesbdd set solde = ?  where idcompte= ?";
		try {
			PreparedStatement stat = cnx.prepareStatement(sql);
			stat.setDouble(1, newSolde);
			stat.setInt(2, idCompte);
			stat.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void deleteCompteCourant(Connection cnx, int idCompte) {
		String sql = "delete from comptesbdd where idcompte= ?";
		try {
			PreparedStatement stat = cnx.prepareStatement(sql);
			stat.setInt(1, idCompte);
			stat.execute();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
