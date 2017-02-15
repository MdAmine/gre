package fr.norsys.gre.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.norsys.gre.dao.QuestionDAO;
import fr.norsys.gre.exception.TechniqueException;
import fr.norsys.gre.model.Question;
import fr.norsys.gre.model.QuestionType;
import fr.norsys.gre.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	public QuestionDAO questionDAO;

	@Override
	public List<Question> getAll() {
		return questionDAO.getAll();
	}

	@Override
	public Optional<Question> getById(Long id) throws TechniqueException {
		return questionDAO.getById(id);
	}

	@Override
	public List<QuestionType> getAllQuestionTypes() {
		return questionDAO.getAllQuestionTypes();
	}

	@Override
	public Optional<QuestionType> findQuestionTypeById(Long id) {
		return questionDAO.findQuestionTypeById(id);
	}

}
