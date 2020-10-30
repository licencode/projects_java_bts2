package Calculatrice;

import java.util.Scanner;

public class MainCalculatrice {

	public static void main(String[] args) {
		
		// Creation d'un objet Scanner
		Scanner clavier = new Scanner (System.in);
		
		// Creation d'un objet Calculatrice
		Calculatrice calc = new Calculatrice();
		
		// Declaration des operandes
		float op1, op2;
		
		System.out.println("Saisir le 1er operende: ");
		
		op1 = clavier.nextFloat();
		
		System.out.println("Saisir le 2eme operende: ");

		op2 = clavier.nextFloat();
		
		calc.addition(op1, op2);
		calc.soustraction(op1, op2);
		calc.multiplication(op1, op2);
		calc.division(op1, op2);
	}

}
