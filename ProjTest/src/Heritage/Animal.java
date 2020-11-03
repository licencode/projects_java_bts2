package Heritage;

public class Animal {
	
	private float poids;
	private float taille;
	private int age;
	private String couleur;

	// Constructeur
	public Animal(float poids, float taille, int age, String couleur) {
		
		this.poids = poids;
		this.taille = taille;
		this.age = age;
		this.couleur = couleur;
		
	}
	
	// Methodes
	public void mange () {
		System.out.println("Je mange ...");
	}
	public void boir () {
		System.out.println("Je bois de l'eau");
	}
}
