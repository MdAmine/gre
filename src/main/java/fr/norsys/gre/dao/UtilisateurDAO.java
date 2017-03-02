package fr.norsys.gre.dao;

import java.util.List;

import fr.norsys.gre.model.Utilisateur;

public interface UtilisateurDAO extends IDAO<Utilisateur> {

	Utilisateur findByEmail(String email);

	List<Utilisateur> getAll();
}
