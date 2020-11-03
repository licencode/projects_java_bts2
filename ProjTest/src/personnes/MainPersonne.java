package personnes;

public class MainPersonne {

	public static void main(String[] args) {

		// Creation d'une personne avec le 1er constructeur
		Personne personne1 = new Personne("Dupont", "Paul", 30);
		
		// Creation d'une personne avec le 2eme constructeur
		Personne personne2 = new Personne("Bond", "James");
		
		System.out.println("Nom est: " + personne1.getNom() + ", Prenom est: " + personne1.getPrenom() + 
				", il y a " + personne1.getAge() + " ans");
		
		personne2.setAge(90); // pour ajouter la age de personne
		System.out.println("Nom est: " + personne2.getNom() + ", Prenom est: " + personne2.getPrenom() +
				", il y a " + personne2.getAge() + " ans");
	}

}
