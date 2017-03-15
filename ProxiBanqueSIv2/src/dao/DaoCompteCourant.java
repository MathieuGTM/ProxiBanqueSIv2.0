package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import metier.Client;
import metier.CompteCourant;

public class DaoCompteCourant implements IDaoCompteCourant{
	
	
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
	public void updateCompteDecouvert(Connection cnx, int idCompte, int newDecouvert) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateClientSolde(Connection cnx, int idClient, int newSolde) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCompteCourant(Connection cnx, int idCompte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int selectIdComptebyName(Connection cnx, String name) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
