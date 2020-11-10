package ClasseAbstrait;

public class Chien extends Animal{

	public Chien(float poids, float taille, int age, String couleur) {
		super(poids, taille, age, couleur);
		
	}

	@Override
	public void mange() {
		System.out.println("Je mange de la vainde surtout croquettes ...");
		
	}

	@Override
	public void boir() {
		System.out.println("Je bois de l'eau");
		
	}

}
