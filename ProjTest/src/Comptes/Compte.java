package Comptes;

public class Compte {
	
	// Attributs
	private int numCompte;
	private float solde;
	
	// Constructeurs
	
	public Compte () {
		numCompte = 0;
		solde = 0;
		
	}
	
	// Methodes
	public void crediter(float somme) {
		solde = solde + somme;
	}
	
	public void debiter(float somme) {
		solde = solde - somme;
	}
	
	public void consulter() {
		System.out.println("Le solde est de " + solde);
	}

}
