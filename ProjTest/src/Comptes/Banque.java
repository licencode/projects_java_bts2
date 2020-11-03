package Comptes;

public class Banque {
	
	private String nom;
	private String adresse;
	private int nbComptes;
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getNbComptes() {
		return nbComptes;
	}
	public void setNbComptes(int nbComptes) {
		this.nbComptes = this.nbComptes + nbComptes; // "this." est adresse de l'objet
	}
	

}
