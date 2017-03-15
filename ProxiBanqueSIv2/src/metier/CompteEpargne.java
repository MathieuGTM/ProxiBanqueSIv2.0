package metier;

/**
 * @author adminl
 * La classe CompteEpargne étend la classe Compte et ajoute l'attribut : taux et idCompteCourant
 */
public class CompteEpargne extends Compte{

		private double taux = 0.03;
		

		

		public CompteEpargne(int idCompte, double solde, String dateCreation, double taux) {
			super( solde, dateCreation);
			this.taux = taux;
	
		}

		public double getTaux() {
			return taux;
		}

		public void setTaux(double taux) {
			this.taux = taux;
		}

		@Override
		public String toString() {
			return "CompteEpargne [taux=" + taux + "]";
		} 
		
		
		
		
}
