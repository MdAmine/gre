package fr.norsys.gre.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.norsys.gre.dao.ExamDAO;
import fr.norsys.gre.exception.TechniqueException;
import fr.norsys.gre.model.Exam;
import fr.norsys.gre.service.ExamService;

@Service
public class ExamServiceImpl implements ExamService {

	@Autowired
	public ExamDAO examDAO;

	@Override
	public List<Exam> getAll() {
		return examDAO.getAll();
	}

	@Override
	public Optional<Exam> getById(Long id) throws TechniqueException {
		return examDAO.getById(id);
	}

}
