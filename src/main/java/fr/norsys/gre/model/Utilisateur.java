package fr.norsys.gre.model;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Utilisateur implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nom;
	private String prenom;
	private String email;
	private String login;
	private String motDePasse;
	private List<Role> roles;

}
