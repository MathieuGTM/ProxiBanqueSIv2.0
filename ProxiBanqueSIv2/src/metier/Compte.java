package metier;

/**
 * @author adminl
 * La classe abstraite compte d�finit les attributs : idCompte, solde et type (courant ou �pargne)
 */
public abstract class Compte {
	
	private int idCompte;
	private double solde;
	private String type;
	
	public Compte(int idCompte, double solde, String type) {
		super();
		this.idCompte = idCompte;
		this.solde = solde;
		this.type = type;
	}

	public int getIdCompte() {
		return idCompte;
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
