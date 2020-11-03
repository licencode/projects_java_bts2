package Comptes;

public class Compte {
	
	// Attributs
	private int numCompte;
	private float solde;
	
	// Constructeurs
	
	public Compte (int num, float soldeInit) {
		numCompte = 0;
		solde = soldeInit;
		
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
