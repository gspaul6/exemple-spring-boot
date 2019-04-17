package dev.exemple.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.exemple.entite.Exemple;

/*
	 * Un contrôleur est un composant de Spring qui permet de gérer une requête
	 * HTTP et produire une réponse HTTP
	 */
@RestController
// Ici cette classe va répondre aux requêtes `/exemples`
@RequestMapping("/exemples")
public class ExempleApiController {

	// Cette méthode va être invoquée pour une requête HTTP `GET /exemples`
	@GetMapping
	public List<Exemple> listerexemples() {

		// La méthode retourne une liste d'objets Java
		// qui sera transformée automatiquement en JSON
		return Arrays.asList(new Exemple("val 1.1", "val 1.2"), new Exemple("val 2.1", "val 2.2"));
	}

}
