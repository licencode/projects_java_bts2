package Comptes;

public class MainCompte {

	public static void main(String[] args) {
		
		// Creation d'un compte vide
		Compte cpt1 = new Compte(1,150);
		
		// Creation d'un compte avec un numero de compte et un solde initial
		Compte cpt2 = new Compte(2,200.5f);

		// Operation sur les comptes 
		cpt1.consulter();
		cpt2.consulter();

		
		cpt1.crediter(100);
		cpt2.debiter(50);

		
		cpt1.consulter();
		cpt2.consulter();
	}

}
