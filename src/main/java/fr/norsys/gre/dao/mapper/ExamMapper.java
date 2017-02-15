package fr.norsys.gre.dao.mapper;

import java.util.List;

import fr.norsys.gre.model.Exam;

public interface ExamMapper extends Mapper<Exam> {

	List<Exam> getAll();

}
