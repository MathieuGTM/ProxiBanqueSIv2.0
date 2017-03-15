package presentation;

import java.sql.Connection;

import dao.DaoService;
import metier.*;
import service.IserviceCompteCourant;
import service.IserviceCompteEpargne;
import service.ServiceCompteCourant;
import service.ServiceCompteEpargne;

public class TestOperationsBancaires {

	public static void main(String[] args) {
		
		Connection cnx = DaoService.SeConnecter();
		IserviceCompteCourant servCC = new ServiceCompteCourant();
		IserviceCompteEpargne servCE = new ServiceCompteEpargne();

		Client c1 = new Client(101, "dup1", "ali1", "ali1@gmail.com", "15 rue des zoo1", "Paris", 75001);
		Client c2 = new Client(102, "dup2", "ali2", "ali2@gmail.com", "15 rue des zoo2", "Paris", 75001);
		Client c3 = new Client(103, "dup3", "ali3", "ali3@gmail.com", "15 rue des zoo3", "Paris", 75001);
		Client c4 = new Client(104, "dup4", "ali4", "ali4@gmail.com", "15 rue des zoo4", "Paris", 75001);
		
		
		Compte cc1 = new CompteCourant(1000, "20010205", 800);
		Compte cc2 = new CompteCourant(1000, "20010205", 800);
		CompteCourant cc3 = new CompteCourant(1000, "20010205", 800);
		CompteCourant cc4 = new CompteCourant(1000, "20010205", 800);

		
		CompteEpargne ce1 = new CompteEpargne(101, 2000, "20000605", 0.03);
		CompteEpargne ce2 = new CompteEpargne(102, 2000, "20000605", 0.03);
		CompteEpargne ce3 = new CompteEpargne(102, 2000, "20000605", 0.03);
		CompteEpargne ce4 = new CompteEpargne(103, 2000, "20000605", 0.03);

		
		servCC.virement(500, cc1, cc2);
		//System.out.println("nouveau solde du compte débiteur : " + cc1.getSolde() + ", nouveau solde du compte créditeur : " + cc2.getSolde());
		
		
		
		
		
		//DaoService.SeDeconnecter(cnx);
		
	}

}
