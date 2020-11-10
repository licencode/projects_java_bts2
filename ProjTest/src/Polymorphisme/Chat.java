package Polymorphisme;

public class Chat extends Animal{ //extends s'indique que class Chat est une fille de class Animal

	public Chat(float poids, float taille, int age, String couleur) {
		super(poids, taille, age, couleur);
		
	} 
	
	// Methodes
		public void mange () {
			System.out.println("Je mange du poisson, de la vainde ...");
		}
		public void boir () {
			System.out.println("Je bois de l'eau et du lait");
		}
		


	
}
