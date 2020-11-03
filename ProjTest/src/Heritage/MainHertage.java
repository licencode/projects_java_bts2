package Heritage;

public class MainHertage {

	public static void main(String[] args) {

		// Creation d'un animal
		Animal animal1 = new Animal(10, 1.2f, 50, "Noir");
		
		// Creation un chat
		Chat chat1 = new Chat(2, 0.80f, 2, "Gris");
		
		// Creation un Chien
		Chien chien1 = new Chien(3, 1.5f, 4, "Marron");
		
		
		animal1.boir();
		animal1.mange();
		
		chat1.boir();
		chat1.mange();
		
		chien1.boir();
		chien1.mange();
	}

}
