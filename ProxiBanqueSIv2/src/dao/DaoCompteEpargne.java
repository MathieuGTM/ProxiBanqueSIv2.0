package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import metier.CompteEpargne;

public class DaoCompteEpargne implements IdaoCompteEpargne {

	@Override
	public void insertCompteEpargne(CompteEpargne compteepargne, Connection cnx) {
		String sql = "insert into compteEpargnebdd values (seqIdCompte.nextval,?,?,?)";

		try {
			PreparedStatement pstat = cnx.prepareStatement(sql);
			pstat.setDouble(1, compteepargne.getSolde());
			pstat.setString(2, compteepargne.getDateCreation());
			pstat.setDouble(3, compteepargne.getTaux());

			pstat.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void updateCompteTaux(Connection cnx, int idCompteEpargne, double newTaux) {

		String sql = "update comptecourantbdd set decouvert = ?  where idcompte= ?";
		try {
			PreparedStatement stat = cnx.prepareStatement(sql);
			stat.setDouble(1, newTaux);
			stat.setInt(2, idCompteEpargne);
			stat.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void updateCompteEpargneSolde(Connection cnx, int idCompteEpargne, double newSolde) {

		String sql = "update compteEpargnebdd set solde = ?  where idcompte= ?";
		try {
			PreparedStatement stat = cnx.prepareStatement(sql);
			stat.setDouble(1, newSolde);
			stat.setInt(2, idCompteEpargne);
			stat.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void deleteCompteEpargne(Connection cnx, int idCompteEpargne) {
		String sql = "delete from comptecourantbdd where idcompteEpargne = ?";
		try {
			PreparedStatement stat = cnx.prepareStatement(sql);
			stat.setInt(1, idCompteEpargne);
			stat.execute();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public int selectIdComptebyName(Connection cnx, String name) {
		int idCompteEpargne = 0;
		try {
			String sql = "select idcompte from CompteEpargnebdd where upper(name) =upper(?)";
			PreparedStatement stat = cnx.prepareStatement(sql);
			stat.setString(1, name);
			ResultSet res = stat.executeQuery();
			while (res.next()) {
				idCompteEpargne = res.getInt("idcompteEpargne");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		return idCompteEpargne;
	}

}
