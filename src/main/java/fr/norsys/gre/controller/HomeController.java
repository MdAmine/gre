package fr.norsys.gre.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.norsys.gre.exception.TechniqueException;
import fr.norsys.gre.model.Exam;
import fr.norsys.gre.service.ExamService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
	ExamService examService;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 * 
	 * @throws TechniqueException
	 * @throws NumberFormatException
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws NumberFormatException, TechniqueException {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		Optional<Exam> exam = this.examService.getById(Long.parseLong("1"));
		model.addAttribute("exam", exam.get());
		
		System.out.println(exam.get().getCreateur().getNom()); 

		return "home";
	}

}
