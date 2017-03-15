package metier;

/**
 * @author adminl
 * La classe CompteCourant �tend la classe compte et lui ajoute l'attribut : decouvert (1000� par d�faut)
 */
public class CompteCourant extends Compte {
	
	private double decouvert = 1000.0;  // par d�faut

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
