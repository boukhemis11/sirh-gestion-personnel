/**
 * 
 */
package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

/**
 * @author boukh
 *
 */
public class CreeNouveauCollaborateur extends HttpServlet {
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	
    public static final String CHAMP_NOM = "nom";
    public static final String CHAMP_PRENOM = "prenom";
    public static final String CHAMP_DATE = "date_de_naissance";
    public static final String CHAMP_ADRESSE = "adresse";
    public static final String CHAMP_NSS = "nss";
    
    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
	//ResourceBundle bundle = ResourceBundle.getBundle("application");
	String emailSociete = "societe.com";

    /* Récupération des champs du formulaire. */
    String nom = request.getParameter( CHAMP_NOM );
    String prenom = request.getParameter( CHAMP_PRENOM );
	ZonedDateTime dateHeureCreation = ZonedDateTime.now();
    String dateDeNaissance = request.getParameter( CHAMP_DATE );
    String adresse = request.getParameter( CHAMP_ADRESSE );
    String numeroDeSecuriteSociale = request.getParameter( CHAMP_NSS );
	String emailPro = prenom + "." + nom + "@" + emailSociete;
    
    Collaborateur collab = new Collaborateur(nom, prenom, dateDeNaissance, adresse, numeroDeSecuriteSociale,
			emailPro, "photo.png", emailPro, dateHeureCreation, true);
    
    collabService.sauvegarderCollaborateur(collab);
    
    request.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(request, response);
    }
}  
