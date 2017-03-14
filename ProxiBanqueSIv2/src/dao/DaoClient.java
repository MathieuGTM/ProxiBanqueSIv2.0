/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import metier.Client;

/**
 *
 * @author adminl
 */
public class DaoClient implements IDaoClient {

	
	@Override
    public void insertClient(Client client, Connection cnx) {
        String sql = "insert into clientbdd values (seqIdClient.nextval,?,?,?,?,?,?)";
               
        try {
            PreparedStatement pstat = cnx.prepareStatement(sql);
            pstat.setString(1, client.getNom());
            pstat.setString(2, client.getPrenom());
            pstat.setString(3, client.getEmail());
            pstat.setString(4, client.getAdresse());
            pstat.setString(5, client.getVille());
            pstat.setInt(6, client.getCp());
            pstat.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

	@Override
    public void updateClientNom(Connection cnx, String idClient, String newName) {
       
        String sql = "update clientsbdd set nom = ?  where idclient= ?";
        try {
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setString(1, newName);
            stat.setString(2, idClient);
            stat.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

	@Override
    public  void updateClientPrenom(Connection cnx, String idClient, String newPrenom) {
        
        String sql = "update clientsbdd set prenom = ?  where idclient= ?";
        try {
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setString(1, newPrenom);
            stat.setString(2, idClient);
            stat.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
	
	@Override
    public  void updateClientEmail(Connection cnx, String idClient, String newEmail) {
        
        String sql = "update clientsbdd set email = ?  where idclient= ?";
        try {
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setString(1, newEmail);
            stat.setString(2, idClient);
            stat.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
	@Override
    public  void updateClientAdresse(Connection cnx, String idClient, String newAdresse) {
        
        String sql = "update clientsbdd set adresse = ?  where idclient= ?";
        try {
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setString(1, newAdresse);
            stat.setString(2, idClient);
            stat.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
	@Override
    public  void updateClientVille(Connection cnx, String idClient, String newVille) {
        
        String sql = "update clientsbdd set adresse = ?  where idclient= ?";
        try {
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setString(1, newVille);
            stat.setString(2, idClient);
            stat.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
	@Override
    public  void updateClientCp(Connection cnx, String idClient, String newCp) {
        
        String sql = "update clientsbdd set adresse = ?  where idclient= ?";
        try {
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setString(1, newCp);
            stat.setString(2, idClient);
            stat.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
	
	
	
	@Override
    public  void deleteClient(Connection cnx, String idClient) {
        String sql = "delete from clientbdd where idclient = ?";
        try {
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setString(1, idClient);
            stat.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

	@Override
    public  Collection<Client> selectAllClient(Connection cnx) {
        Collection<Client> listClient = new ArrayList<>();
        try {
            Statement stat = cnx.createStatement();
            String sql = "select * from Clientbdd";

            ResultSet res = stat.executeQuery(sql);
            while (res.next()) {
                int idclient = res.getInt("idclient");
                String nom = res.getString("nom");
                String prenom = res.getString("prenom");
                String email = res.getString("email");
                String adresse = res.getString("adresse");
                String ville = res.getString("ville");
                int codepostal = res.getInt("cp");
            
                Client newClient = new Client(idclient, nom, prenom, email, adresse, ville, codepostal);
                listClient.add(newClient);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return listClient;
    }

	@Override
    public  int selectIdbyName(Connection cnx, String name) {
        int idClient = 0;
        try {
            String sql = "select idclient from Clientbdd where upper(name) =upper(?)";
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setString(1, name);
            ResultSet res = stat.executeQuery();
            while (res.next()) {
                idClient = res.getInt("idclient");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return  idClient;   
    }

	
}

