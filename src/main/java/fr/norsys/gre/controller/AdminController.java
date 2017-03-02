package fr.norsys.gre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.norsys.gre.model.Utilisateur;
import fr.norsys.gre.service.UserService;

@RequestMapping("admin")
@Controller
public class AdminController {

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String AdminIndex(Model model) {

		List<Utilisateur> utilisateurs = this.userService.getAll();

		model.addAttribute("utilisateurs", utilisateurs);

		return "admin/index";
	}

	@RequestMapping("/add")
	public String questionAddForm(Model model) {

		Utilisateur utilisateur = new Utilisateur();

		model.addAttribute("utilisateur", utilisateur);

		return "admin/add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String questionAdd(Model model, @ModelAttribute("utilisateur") Utilisateur utilisateur) {

		this.userService.registerNewUserAccount(utilisateur);

		return "admin/index";
	}

}