package fr.norsys.gre.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.norsys.gre.dao.ExamDAO;
import fr.norsys.gre.exception.TechniqueException;
import fr.norsys.gre.model.Exam;

@Service
public class ExamServiceImpl implements ExamService {

	@Autowired
	public ExamDAO examDAO;

	@Override
	public List<Exam> getListExam() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Exam> getById(Long id) throws TechniqueException {
		return examDAO.getById(id);
	}

}
