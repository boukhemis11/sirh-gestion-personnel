/**
 * 
 */
package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author boukh
 *
 */
public class EditerCollaborateurController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
		ServletException, IOException {



		String matricule = req.getParameter("matricule");
		String titre = req.getParameter("titre");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		resp.setStatus(200);
		resp.setContentType("text/html");
		// code HTML ecrit dans le corps de la reponse
		resp.getWriter().write("<h1>Edition de collaborateur</h1>"

		+ "<p>matricule="+ matricule + "</p>"
		+ "<p>titre="+ titre + "</p>"
		+ "<p>nom="+ nom + "</p>"
		+ "<p>prenom="+ prenom + "</p>");
	}
}
