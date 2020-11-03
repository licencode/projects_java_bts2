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

	// Getter pour nom
	public String getNom() {
		return nom;
	}
	
	// Setter pour nom
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	// Getter pour prenom
	public String getPrenom() {
		return prenom;
	}
	
	// Setter pour prenom
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	// Getter pour age
	public int getAge() {
		return age;
	}
	
	// Setter pour age
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	

}
