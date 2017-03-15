package metier;

/**
 * @author adminl
 * La classe abstraite compte définit les attributs : idCompte, solde et type (courant ou épargne)
 */
public abstract class Compte {
	
	private int idCompte;
	private double solde;
	private String dateCreation;
	private String type;
	
	public Compte(int idCompte, double solde, String dateCreation, String type) {
		super();
		this.idCompte = idCompte;
		this.solde = solde;
		this.type = type;
	}

	public int getIdCompte() {
		return idCompte;
	}


	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getDateCreation() {
		return dateCreation;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
}
