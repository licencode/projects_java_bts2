package ClasseAbstrait;

public class Chat extends Animal{ //extends s'indique que class Chat est une fille de class Animal

	public Chat(float poids, float taille, int age, String couleur) {
		super(poids, taille, age, couleur);
		
	}

	@Override
	public void mange() {
		System.out.println("Je mange du poisson");
		
	}

	@Override
	public void boir() {
		System.out.println("Je bois de l'eau meau !!!");
		
	} 

	
}
