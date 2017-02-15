package fr.norsys.gre.model;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Question implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String contenu;
	private double note;
	private Utilisateur createur;
	private QuestionType type;
	private List<QuestionChoix> questionChoix;

}
