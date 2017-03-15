package metier;

/**
 * @author adminl
 * La classe abstraite compte définit les attributs :, solde et date de création
 */
public abstract class Compte {
	
	private double solde;
	private String dateCreation;
	
	
	public Compte( double solde, String dateCreation) {
		super();
		this.dateCreation = dateCreation;
		this.solde = solde;
		
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


	
	
}
