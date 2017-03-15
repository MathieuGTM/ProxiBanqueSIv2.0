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

public class DaoCompteCourant implements IdaoClient{
	
	
	@Override
    public void insertCompteCourant(CompteCourant comptecourant, Connection cnx) {
        String sql = "insert into compteCourantbdd values (seqIdCompte.nextval,?,?,?,?,?,?)";
               
        try {
            PreparedStatement pstat = cnx.prepareStatement(sql);
            pstat.setLong(1, comptecourant.getSolde());
            pstat.setString(2, comptecourant.getDateCreation());
            pstat.setLong(3, comptecourant.getDecouvert());
           
            pstat.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
