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
	
	public Compte (int num, float soldeInit) {
		numCompte = 0;
		solde = soldeInit;
		
	}
	
	public Compte (int num) {
		numCompte = num;
		solde = 0;
		
	}
	
	public Compte (float somme) {
		numCompte = 0;
		solde = somme;
		
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
