package fr.norsys.gre.model;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Exam implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String libelle;
	private String statue;
	private Utilisateur createur;
	private ExamType type;

	private List<Question> questions;
	

	
}
