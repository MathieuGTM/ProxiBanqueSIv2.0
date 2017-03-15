package metier;

import java.util.Collection;

/**
 * @author adminl
 * La classe client étend la classe personne et lui ajoute les attributs : idClient et une collection de compte(s)
 */
public class Client extends Personne {
	
	private int idClient;
	private Collection<Compte> listeCompte;
	
	public Client(String nom, String prenom, String email, String adresse, String ville, int cp, 
			Collection<Compte> listeCompte) {
		super(nom, prenom, email, adresse, ville, cp);
		this.listeCompte = listeCompte;
	}
	
	public Client(String nom, String prenom, String email, String adresse, String ville, int cp) {
		super(nom, prenom, email, adresse, ville, cp);
	}

	public int getIdClient() {
		return idClient;
	}

	public Collection<Compte> getListeCompte() {
		return listeCompte;
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", listeCompte=" + listeCompte + "]";
	}

	
	
}
