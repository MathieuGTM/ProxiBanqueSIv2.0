package metier;

/**
 * @author adminl
 * La classe CompteCourant étend la classe compte et lui ajoute l'attribut : decouvert (1000€ par défaut)
 */
public class CompteCourant extends Compte {
	private int idCompteCourant;
	private double decouvert = 1000.0;  // par défaut

	public CompteCourant(int idCompteCourant, double solde, String dateCreation, double decouvert) {
		super( solde, dateCreation);
		this.decouvert = decouvert;
		this.idCompteCourant = idCompteCourant;
	}

	public int getIdCompteCourant() {
		return idCompteCourant;
	}

	

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

}
