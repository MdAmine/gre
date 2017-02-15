package fr.norsys.gre.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class QuestionChoix implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String contenu;
	private boolean correcte;
	private Question question;

}