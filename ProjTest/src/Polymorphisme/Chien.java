package Polymorphisme;

public class Chien extends Animal{

	public Chien(float poids, float taille, int age, String couleur) {
		super(poids, taille, age, couleur);
		
	}
	
	// Methodes
	public void mange () {
		System.out.println("Je mange de la vainde surtout croquettes ...");
	}
	public void boir () {
		System.out.println("Pareil que ma classe mere ...");
	}

}
