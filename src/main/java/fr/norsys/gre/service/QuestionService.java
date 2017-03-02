package fr.norsys.gre.service;

import java.util.List;
import java.util.Optional;

import fr.norsys.gre.exception.TechniqueException;
import fr.norsys.gre.model.Question;
import fr.norsys.gre.model.QuestionType;

public interface QuestionService {

	List<Question> getAll();

	List<QuestionType> getAllQuestionTypes();

	Optional<QuestionType> findQuestionTypeById(Long id);

	/**
	 * consulter une question
	 *
	 * @param id
	 *            l'id de la question
	 * @return
	 * @throws TechniqueException
	 */
	Optional<Question> getById(Long id) throws TechniqueException;
}
