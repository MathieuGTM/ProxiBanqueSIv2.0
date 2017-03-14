package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DaoService {
	
	        public static Connection SeConnecter() {
	        Connection cnx = null;
	        try {

	            Class.forName("com.mysql.jdbc");
	            cnx = DriverManager.getConnection("jdbc:mysql://localhost//ProxiBanqueSIv2", "root","");

	        } catch (Exception e) {
	            System.out.println(e.getMessage());

	        }
	        return cnx;
	    }

	    public static void SeDeconnecter(Connection cnx) {
	        try {
	            cnx.close();
	        } catch (Exception e) {
	            System.out.println(e.getMessage());

	        }
	    }
	}

