package fr.norsys.gre.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.norsys.gre.dao.ExamDAO;
import fr.norsys.gre.dao.mapper.ExamMapper;
import fr.norsys.gre.dao.mapper.Mapper;
import fr.norsys.gre.model.Exam;

@Repository
public class ExamDAOImpl extends ADAO<Exam> implements ExamDAO {

	@Autowired
	private ExamMapper examMapper;

	protected ExamDAOImpl() {
		super(Exam.class);
	}

	@Override
	protected Mapper<Exam> getMapper() {
		return this.examMapper;
	}

	@Override
	public List<Exam> getAll() {
		return examMapper.getAll();
	}

}
