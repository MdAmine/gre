package fr.norsys.gre.dao;

import java.util.List;
import java.util.Optional;

import fr.norsys.gre.model.Question;
import fr.norsys.gre.model.QuestionType;

public interface QuestionDAO extends IDAO<Question> {

	List<Question> getAll();

	List<QuestionType> getAllQuestionTypes();

	Optional<QuestionType> findQuestionTypeById(Long id);

}
