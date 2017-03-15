package metier;

/**
 * @author adminl
 * La classe CompteCourant étend la classe compte et lui ajoute l'attribut : decouvert (1000€ par défaut)
 */
public class CompteCourant extends Compte {
	
	private double decouvert = 1000.0;  // par défaut

	public CompteCourant(int idCompte, double solde,String dateCreation,  String type, double decouvert) {
		super(idCompte, solde, dateCreation, type);
		this.decouvert = decouvert;
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

}
