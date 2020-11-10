package ExceptionPerso;

public class Compte {

	private int num;
	private float solde;

	public Compte(int num, float solde) throws ExceptionSoldeNeg {

		if (solde < 0) {
			// Creer l'objet ExceptionSoldeNeg
			throw new ExceptionSoldeNeg();

		} else {
			this.num = num;
			this.solde = solde;
		}

	}

	public void consulter() {
		System.out.println("Votre compte est: " + num + " Solde du compte = " + solde);
	}
}
