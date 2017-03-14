package metier;

/**
 * @author Mathieu, Mehrzia et Aurelie
 * La classe abstraite Personne définit les attributs de la classe personne : nom, 
 * prenom, email, adresse, ville, cp
 */
public abstract class Personne {
	
	private String nom, prenom, email, adresse, ville;
	private int cp;
	
	
	public Personne(String nom, String prenom, String email, String adresse, String ville, int cp) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
		this.ville = ville;
		this.cp = cp;
	}
	
	
	public Personne() {
		super();
		this.nom = "toto";
		this.prenom = "tata";
		this.email = "toto@gmail.com";
		this.adresse = "abcde";
		this.ville = "Paris";
		this.cp = 75001;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public int getCp() {
		return cp;
	}


	public void setCp(int cp) {
		this.cp = cp;
	}


	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", adresse=" + adresse + ", ville="
				+ ville + ", cp=" + cp + "]";
	}
	
	
	
	
	
}
