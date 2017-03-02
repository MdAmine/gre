package fr.norsys.gre.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import fr.norsys.gre.dao.UtilisateurDAO;
import fr.norsys.gre.exception.TechniqueException;
import fr.norsys.gre.model.Utilisateur;
import fr.norsys.gre.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UtilisateurDAO utilisateurDao;

	@Autowired
	private PasswordEncoder encoder;

	@Override
	public List<Utilisateur> getAll() {
		return this.utilisateurDao.getAll();
	}

	@Override
	public Optional<Utilisateur> getById(Long id) throws TechniqueException {
		return this.utilisateurDao.getById(id);
	}

	@Override
	public void registerNewUserAccount(Utilisateur u) {

		u.setMotDePasse(this.encoder.encode(u.getMotDePasse()));

		try {
			this.utilisateurDao.create(u);
		} catch (TechniqueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
