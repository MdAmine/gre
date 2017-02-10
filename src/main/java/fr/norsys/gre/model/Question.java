package fr.norsys.gre.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Question implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String contenu;
	private double note;
	private Utilisateur createur;
	private QuestionType type;

}
