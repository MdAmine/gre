package fr.norsys.gre.dao.mapper;

import java.util.List;

import fr.norsys.gre.model.Question;
import fr.norsys.gre.model.QuestionType;

public interface QuestionMapper extends Mapper<Question> {

	List<Question> getAll();

	List<QuestionType> getAllQuestionTypes();

	QuestionType findQuestionTypeById(Long id);

}
