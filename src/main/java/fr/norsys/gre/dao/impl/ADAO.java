package fr.norsys.gre.dao.impl;

import java.util.Optional;

import org.springframework.dao.DataAccessException;

import fr.norsys.gre.dao.IDAO;
import fr.norsys.gre.dao.mapper.Mapper;
import fr.norsys.gre.exception.TechniqueException;

/**
 * Implémentation Dao générique qui fournit les méthodes CRUD
 *
 * @author SAOUD Mohamed Amine
 * @param <T>
 */

public abstract class ADAO<T> implements IDAO<T> {

	private String modelName;

	protected abstract Mapper<T> getMapper();

	public ADAO() {
		super();
	}

	/**
	 * contructeur
	 *
	 * @param clazz
	 */
	protected ADAO(Class<T> clazz) {
		this.modelName = clazz.getSimpleName();
	}

	public T create(T model) throws TechniqueException {
		try {
			this.getMapper().create(model);
			return model;
		} catch (DataAccessException dae) {
			String message = "Une erreur est survenue lors de la création de l'objet " + this.modelName + " .";

			throw new TechniqueException(message, dae);
		}
	}

	public void update(T model) throws TechniqueException {
		// TODO Auto-generated method stub
	}

	public Optional<T> getById(Long id) throws TechniqueException {
		try {
			T model = this.getMapper().getById(id);
			return Optional.ofNullable(model);
		} catch (DataAccessException dae) {
			throw new TechniqueException(
					"Une erreur est survenue lors de la récupération de l'objet Exam d'id : " + id + " .", dae);
		}
	}

	public void delete(T model) throws TechniqueException {
		// TODO Auto-generated method stub
	}

}
