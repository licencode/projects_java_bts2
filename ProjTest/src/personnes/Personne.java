package personnes;

public class Personne {
	
	// Atributs
	private String nom;
	private String prenom;
	private int age;
	
	//Constructeurs
	public Personne(String nomPersonne, String prenomPersonne, int agePersonne) {
		
		nom = nomPersonne;
		prenom = prenomPersonne;
		age = agePersonne;
	}
	
	public Personne(String nomPersonne, String prenomPersonne) {
		
		this.nom = nomPersonne;
		this.prenom = prenomPersonne;
	}
	
	

	
	

}
