package Comptes;

public class Compte {
	
	// Attributs
	private int numCompte;
	private float solde;
	
	// Constructeurs
	
	public Compte () { // Si tout les methodes vide
		numCompte = 0;
		solde = 0;
		
	}
	
	public Compte (int num, float soldeInit) { // Si tout les mothodes choisir
		numCompte = num;
		solde = soldeInit;
		
	}
	
	public Compte (int num) { // Si int est compte
		numCompte = num;
		solde = 0;
		
	}
	
	public Compte (float somme) { // Si float est solde
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
		System.out.println("Le solde du compte " + numCompte + " est de " + solde);
	}

}
