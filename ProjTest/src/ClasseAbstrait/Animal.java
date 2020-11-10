package ClasseAbstrait;

abstract public class Animal {
	
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
	abstract public void mange ();
	abstract public void boir ();
	
	public void seDeplacer() {
		System.out.println("Je me deplace");
	}
}
