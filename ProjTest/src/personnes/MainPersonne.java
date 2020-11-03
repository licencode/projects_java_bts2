package personnes;

public class MainPersonne {

	public static void main(String[] args) {

		// Creation d'une personne avec le 1er constructeur
		Personne personne1 = new Personne("Dupont", "Paul", 30);
		
		// Creation d'une personne avec le 2eme constructeur
		Personne personne2 = new Personne("Bond", "James");
		
		System.out.println("Nom est: " + personne1.getNom() + ", Prenom est: " + personne1.getPrenom() + ", age " + personne1.getAge());
		System.out.println("Nom est: " + personne2.getNom() + ", Prenom est: " + personne2.getPrenom());
	}

}
