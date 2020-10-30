package Saisie;

import java.util.Scanner;

public class MainSaisie {

	public static void main(String[] args) {
		// Creation d'un objet Scanner
		Scanner clavier = new Scanner(System.in);
		
		int a;
		float b;
		String chaine;
		
		// Recuperer une chaine de caracteres
		System.out.println("Saisir une chaine: ");
		chaine = clavier.nextLine();
		
		// Recuperer un entier
		System.out.println("Saisir un entier: ");
		a = clavier.nextInt();
		
		// Recuperer un reel
		System.out.println("Saisir un reel: ");
		b = clavier.nextFloat();
		
		System.out.println("Chaine = " + chaine + " Int = " + a + " Float = " + b);
	}

}
