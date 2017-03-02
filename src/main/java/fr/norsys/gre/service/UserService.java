package fr.norsys.gre.service;

import java.util.List;
import java.util.Optional;

import fr.norsys.gre.exception.TechniqueException;
import fr.norsys.gre.model.Utilisateur;

public interface UserService {

	List<Utilisateur> getAll();

	Optional<Utilisateur> getById(Long id) throws TechniqueException;

	public void registerNewUserAccount(Utilisateur u);
}
