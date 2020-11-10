package Calculatrice;

public class Calculatrice {

	// Atributs
	public float resultat;

	// Methodes
	public void addition(float op1, float op2) {
		resultat = op1 + op2;
		System.out.println("Resultat est : " + resultat);
	}

	public void soustraction(float op1, float op2) {
		resultat = op1 - op2;
		System.out.println("Resultat est : " + resultat);
	}

	public void multiplication(float op1, float op2) {
		resultat = op1 * op2;
		System.out.println("Resultat est : " + resultat);
	}

	public void division(float op1, float op2) {
		if (op2 != 0) {
			resultat = op1 / op2;
			System.out.println("Resultat est : " + resultat);
		} else {
			System.out.println("Tentative de division par 0!! ");
		}

	}
}
