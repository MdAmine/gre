package fr.norsys.gre.dao.mapper;

import java.util.List;

import fr.norsys.gre.model.Utilisateur;

public interface UtilisateurMapper extends Mapper<Utilisateur> {

	Utilisateur findByEmail(String email);

	List<Utilisateur> getAll();
}
