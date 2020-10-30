package Instruction;

public class MainInstruction {

	public static void main(String[] args) {
		// Declaration de variables
		
		int a;
		int b = 1;
		
		// Instruction
		// Affectation
		a = 2;
		b = a * 2;
		
		System.out.println("a = " + a + " b = " + b);
		
		// Instruction conditionnelle SI ALORS SINON
		
		if (a == b)
			System.out.println("oui");
		else
			System.out.println("non");
		
		if (b == 4) {
			a = b * 5;
			System.out.println("oui");
		}
		else
			System.out.println("oui");
		
		System.out.println(!(b == 2));
		
		
		// Boucle TANT QUE
		int i = 1;
		while(i <= 10) {
			System.out.println("Bonjour");
			i = i +1;
		}
		
		// Boucle POUR
		for (i = 1; i <= 10; i = i + 1)
			System.out.println(i);
		
		// Classe String: gestion des chaines de caractere
		String chaine1 = "Bonjour";
		System.out.println(chaine1);
		
		String chaine2 = new String ("Bonjour");
		
		System.out.println(chaine2.toUpperCase()); // Fonction 'toUpperCase()' pour mise tout en majuscule
	}

}
