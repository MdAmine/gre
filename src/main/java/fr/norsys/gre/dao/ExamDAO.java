package fr.norsys.gre.dao;

import java.util.List;

import fr.norsys.gre.model.Exam;

public interface ExamDAO extends IDAO<Exam> {

	List<Exam> getAll();
}