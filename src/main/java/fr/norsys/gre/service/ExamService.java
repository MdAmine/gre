package fr.norsys.gre.service;

import java.util.List;
import java.util.Optional;

import fr.norsys.gre.exception.TechniqueException;
import fr.norsys.gre.model.Exam;

public interface ExamService {

	List<Exam> getListExam();

	/**
	 * consulter un Exam
	 * 
	 * @param id
	 *            l'id de l'exam
	 * @return
	 * @throws TechniqueException
	 */
	Optional<Exam> getById(Long id) throws TechniqueException;
}
