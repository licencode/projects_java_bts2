package ClasseAbstrait;

public class MainAbstrait {

	public static void main(String[] args) {
		
		
		// Creation un chat
		Chat chat1 = new Chat(2, 0.80f, 2, "Gris");
		
		// Creation un Chien
		Chien chien1 = new Chien(3, 1.5f, 4, "Marron");
		
		chat1.mange();
		chat1.boir();

		chien1.mange();
		chien1.boir();
		
		chat1.seDeplacer();
	}

}
