package fr.norsys.gre.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.norsys.gre.dao.UtilisateurDAO;
import fr.norsys.gre.dao.mapper.Mapper;
import fr.norsys.gre.dao.mapper.UtilisateurMapper;
import fr.norsys.gre.model.Utilisateur;

@Repository
public class UtilisateurDAOImpl extends ADAO<Utilisateur> implements UtilisateurDAO {

	@Autowired
	private UtilisateurMapper utilisateurMapper;

	protected UtilisateurDAOImpl() {
		super(Utilisateur.class);
	}

	@Override
	protected Mapper<Utilisateur> getMapper() {
		return this.utilisateurMapper;
	}

	@Override
	public Utilisateur findByEmail(String email) {
		return this.utilisateurMapper.findByEmail(email);
	}

	@Override
	public List<Utilisateur> getAll() {
		return this.utilisateurMapper.getAll();
	}

}
