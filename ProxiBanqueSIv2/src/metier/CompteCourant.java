package metier;

/**
 * @author adminl
 * La classe CompteCourant �tend la classe compte et lui ajoute l'attribut : decouvert (1000� par d�faut)
 */
public class CompteCourant extends Compte {
	
	private double decouvert = 1000.0;  // par d�faut

	public CompteCourant(int idCompte, double solde, String dateCreation, double decouvert) {
		super( solde, dateCreation);
		this.decouvert = decouvert;

	}
	public CompteCourant(double solde, String dateCreation, double decouvert) {
		super( solde, dateCreation);
		this.decouvert = decouvert;

	}

	

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

}
