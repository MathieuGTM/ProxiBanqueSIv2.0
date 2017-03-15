package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DaoService {
	
	public static Connection cnx;

	public static Connection SeConnecter() {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			cnx = DriverManager.getConnection("jdbc:MySQL://localhost/proxiBanqueSIv2", "root", "");

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
