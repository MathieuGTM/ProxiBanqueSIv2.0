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
import java.util.Scanner;
import metier.Client;

/**
 *
 * @author adminl
 */
public class DaoClient {

    public static void InsertClient(Client client, Connection cnx) {
        String sql = "insert into client values (seq_idclient.nextval,'" + client.getIdClient() + "','"
                + client.getAdresse() + "'," + client.getCodepostal() + ",'" + client.getVille() + "','" + client.getTelephone() + "',null)";
               
        try {
            Statement stat = cnx.createStatement();
            stat.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void UpdateClientNom(Connection cnx, int idClient, String newName) {
       
        String sql = "update clientsbdd set nom = ?  where idclient= ?";
        try {
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setString(1, newName);
            stat.setInt(2, idClient);
            stat.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    
    public static void UpdateClientPrenom(Connection cnx, int idClient, String newPrenom) {
        
        String sql = "update clientsbdd set prenom = ?  where idclient= ?";
        try {
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setString(1, newPrenom);
            stat.setInt(2, idClient);
            stat.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void UpdateClientEmail(Connection cnx, int idClient, String newEmail) {
        
        String sql = "update clientsbdd set email = ?  where idclient= ?";
        try {
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setString(1, newEmail);
            stat.setInt(2, idClient);
            stat.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void UpdateClientAdresse(Connection cnx, int idClient, String newAdresse) {
        
        String sql = "update clientsbdd set adresse = ?  where idclient= ?";
        try {
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setString(1, newAdresse);
            stat.setInt(2, idClient);
            stat.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void UpdateClientVille(Connection cnx, int idClient, String newVille) {
        
        String sql = "update clientsbdd set adresse = ?  where idclient= ?";
        try {
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setString(1, newVille);
            stat.setInt(2, idClient);
            stat.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public static void UpdateClientCp(Connection cnx, int idClient, String newCp) {
        
        String sql = "update clientsbdd set adresse = ?  where idclient= ?";
        try {
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setString(1, newCp);
            stat.setInt(2, idClient);
            stat.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public static void DeleteClient(Connection cnx) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Id du client ра supprimer?");
        int idClient = sc.nextInt();
        String sql = "delete from client where idclient = ?";
        try {
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setInt(1, idClient);
            stat.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Collection<Client> SelectALLClient(Connection cnx) {
        Collection<Client> listClient = new ArrayList<>();
        try {
            Statement stat = cnx.createStatement();
            String sql = "select * from Client";

            ResultSet res = stat.executeQuery(sql);
            while (res.next()) {
                int idclient = res.getInt("idclient");
                String nom = res.getString("nom");
                String prenom = res.getString("prenom");
                String adresse = res.getString("adresse");
                int codepostal = res.getInt("codepostal");
                String ville = res.getString("ville");
                String email = res.getString("email");
            
                Client newClient = new Client(idclient, nom,prenom, adresse, ville, codepostal, ville, email);
                listClient.add(newClient);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return listClient;
    }

    public static int SelectIdbyName(Connection cnx) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel client voulez-vous rechercher?");
        String name = sc.nextLine();
        System.out.println("Nom de la ville du client?");
        String ville = sc.nextLine();
        System.out.println("step" + ville + name);
        int idclient = 0;
        try {
            String sql = "select idclient from Client where upper(raisonsociale) =upper(?) and upper(ville) = upper(?)";
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setString(1, name);
            stat.setString(2, ville);
            ResultSet res = stat.executeQuery();
            while (res.next()) {
                idclient = res.getInt("idclient");

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return idclient;
    }
}

