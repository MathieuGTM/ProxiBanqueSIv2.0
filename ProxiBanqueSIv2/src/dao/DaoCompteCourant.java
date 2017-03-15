package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



import metier.CompteCourant;

public class DaoCompteCourant implements IDaoCompteCourant {

	@Override
	public void insertCompteCourant(CompteCourant comptecourant, Connection cnx) {
		String sql = "insert into compteCourantbdd values (seqIdCompte.nextval,?,?,?)";

		try {
			PreparedStatement pstat = cnx.prepareStatement(sql);
			pstat.setDouble(1, comptecourant.getSolde());
			pstat.setString(2, comptecourant.getDateCreation());
			pstat.setDouble(3, comptecourant.getDecouvert());

			pstat.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void updateCompteDecouvert(Connection cnx, int idCompteCourant, double newDecouvert) {

		String sql = "update comptecourantbdd set decouvert = ?  where idcompte= ?";
		try {
			PreparedStatement stat = cnx.prepareStatement(sql);
			stat.setDouble(1, newDecouvert);
			stat.setInt(2, idCompteCourant);
			stat.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void updateCompteCourantSolde(Connection cnx, int idCompteCourant, double newSolde) {

		String sql = "update compteCourantbdd set solde = ?  where idcompte= ?";
		try {
			PreparedStatement stat = cnx.prepareStatement(sql);
			stat.setDouble(1, newSolde);
			stat.setInt(2, idCompteCourant);
			stat.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}


@Override
public  void deleteCompteCourant(Connection cnx, int idCompteCourant) {
    String sql = "delete from comptecourantbdd where idcompteCourant = ?";
    try {
        PreparedStatement stat = cnx.prepareStatement(sql);
        stat.setInt(1, idCompteCourant);
        stat.execute();
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}



@Override
public  int selectIdComptebyName(Connection cnx, String name) {
    int idCompteCourant = 0;
    try {
        String sql = "select idcompte from CompteCourantbdd where upper(name) =upper(?)";
        PreparedStatement stat = cnx.prepareStatement(sql);
        stat.setString(1, name);
        ResultSet res = stat.executeQuery();
        while (res.next()) {
            idCompteCourant = res.getInt("idcompte");
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());

    }
    return  idCompteCourant;   
}


}



