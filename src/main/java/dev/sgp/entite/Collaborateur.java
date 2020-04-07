/**
 * 
 */
package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

/**
 * @author boukh
 *
 */
public class Collaborateur {

	private String matricule;
	private String nom;
	private String prenom;
	private String DateDeNaissance;
	private String Adresse;
	private String NumeroDeSecuriteSociale;
	private String emailPro;
	private String photo;
	private ZonedDateTime dateHeureCreation;
	private Boolean actif;
	private String intitulePoste;
	private String banque;
	private String bic;
	private String iban;
	
	public Collaborateur(String matricule, String nom, String prenom, String dateDeNaissance, String adresse,
			String numeroDeSecuriteSociale, String emailPro, String photo, ZonedDateTime dateHeureCreation, Boolean actif) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.DateDeNaissance = dateDeNaissance;
		this.Adresse = adresse;
		this.NumeroDeSecuriteSociale = numeroDeSecuriteSociale;
		this.emailPro = emailPro;
		this.photo = photo;
		this.dateHeureCreation = dateHeureCreation;
		this.actif = actif;
		this.intitulePoste = "";
		this.banque = "";
		this.bic = "";
		this.iban = "";
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

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

	public String getDateDeNaissance() {
		return DateDeNaissance;
	}

	public void setDateDeNaissance(String dateDeNaissance) {
		DateDeNaissance = dateDeNaissance;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getNumeroDeSecuriteSociale() {
		return NumeroDeSecuriteSociale;
	}

	public void setNumeroDeSecuriteSociale(String numeroDeSecuriteSociale) {
		NumeroDeSecuriteSociale = numeroDeSecuriteSociale;
	}

	public String getEmailPro() {
		return emailPro;
	}

	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}

	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}

	public Boolean getActif() {
		return actif;
	}

	public void setActif(Boolean actif) {
		this.actif = actif;
	}

	public String getIntitulePoste() {
		return intitulePoste;
	}

	public void setIntitulePoste(String intitulePoste) {
		this.intitulePoste = intitulePoste;
	}

	public String getBanque() {
		return banque;
	}

	public void setBanque(String banque) {
		this.banque = banque;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}



	
	

}
