package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import metier.CompteEpargne;

/**
 * La classe DaoCompteEpargne impl�mente l'interface IDaoCompteEpargne et d�taille les
 * m�thodes sign�es dans l'interface
 * 
 * @author AMM
 */
public class DaoCompteEpargne implements IdaoCompteEpargne {

	@Override
	public void insertCompteEpargne(CompteEpargne compteepargne, Connection cnx) {
		String sql = "insert into comptesbdd (solde, datecreation) values (?,?)";

		try {
			PreparedStatement pstat = cnx.prepareStatement(sql);
			pstat.setDouble(1, compteepargne.getSolde());
			pstat.setString(2, compteepargne.getDateCreation());

			pstat.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void updateCompteTaux(Connection cnx, int idCompte, double newTaux) {

		String sql = "update comptesbdd set decouvert = ?  where idcompte= ?";
		try {
			PreparedStatement stat = cnx.prepareStatement(sql);
			stat.setDouble(1, newTaux);
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
	public void deleteCompteEpargne(Connection cnx, int idCompte) {
		String sql = "delete from comptesbdd where idcompte = ?";
		try {
			PreparedStatement stat = cnx.prepareStatement(sql);
			stat.setInt(1, idCompte);
			stat.execute();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}


}
