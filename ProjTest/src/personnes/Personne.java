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
	
	// Getters et Setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
