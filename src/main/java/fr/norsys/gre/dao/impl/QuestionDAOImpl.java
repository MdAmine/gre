package fr.norsys.gre.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.norsys.gre.dao.QuestionDAO;
import fr.norsys.gre.dao.mapper.Mapper;
import fr.norsys.gre.dao.mapper.QuestionMapper;
import fr.norsys.gre.model.Question;
import fr.norsys.gre.model.QuestionType;

@Repository
public class QuestionDAOImpl extends ADAO<Question> implements QuestionDAO {

	@Autowired
	private QuestionMapper questionMapper;

	protected QuestionDAOImpl() {
		super(Question.class);
	}

	@Override
	protected Mapper<Question> getMapper() {
		return this.questionMapper;
	}

	@Override
	public List<Question> getAll() {
		return this.questionMapper.getAll();
	}

	@Override
	public List<QuestionType> getAllQuestionTypes() {
		return this.questionMapper.getAllQuestionTypes();
	}

	@Override
	public Optional<QuestionType> findQuestionTypeById(Long id) {

		QuestionType qt = this.questionMapper.findQuestionTypeById(id);
		return Optional.ofNullable(qt);

	}

}
