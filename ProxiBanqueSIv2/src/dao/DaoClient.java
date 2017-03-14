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

    public static void UpdateClient(Connection cnx) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quelle colonne voulez-vous modifier?");
        sc.nextLine();
        String colonne = sc.nextLine();
        System.out.println("Quel client voulez-vous modifier? (idclient)");
        int idClient = sc.nextInt();
        System.out.println("Valeur a mettre a jour?");
        sc.nextLine();
        String valeur = sc.nextLine();
        String sql = "update client set " + colonne + " = ? where idclient=?";

        try {

            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setInt(2, idClient);

            stat.setString(1, valeur);
            stat.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
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

