package fr.norsys.gre.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.norsys.gre.exception.TechniqueException;
import fr.norsys.gre.model.Question;
import fr.norsys.gre.model.QuestionChoix;
import fr.norsys.gre.model.QuestionType;
import fr.norsys.gre.service.QuestionService;

@RequestMapping("question")
@Controller
public class QuestionController {

	@Autowired
	private QuestionService questionService;

	@RequestMapping("/")
	public String questionIndex(Model model) {

		List<Question> questions = questionService.getAll();

		model.addAttribute("questions", questions);

		return "question/index";
	}

	@RequestMapping("/add")
	public String questionAdd(Model model) {

		Question question = new Question();

		model.addAttribute("question", question);

		return "question/add";
	}

	@RequestMapping("/{id}")
	public String questionShow(Model model, @PathVariable("id") Long id) throws TechniqueException {

		Question question = questionService.getById(id).get();

		model.addAttribute("question", question);

		System.out.println(question.getQuestionChoix().get(0).getContenu());
		System.out.println(question.getQuestionChoix().get(1).getContenu());

		return "question/show";
	}

	@RequestMapping("/ajax/show_question_reponses_area")
	public String showSubQuestionAreaAjaxHandler(Model model, @RequestParam(required = true) Long questionTypeId) {

		QuestionType questionType = questionService.findQuestionTypeById(questionTypeId).get();

		if ("SC".equalsIgnoreCase(questionType.getLibelle())) {
			return "question/ajax/SC_area";
		} else if ("MC".equalsIgnoreCase(questionType.getLibelle())) {
			Question question = new Question();
			question.setQuestionChoix(new ArrayList<QuestionChoix>());
			return "question/ajax/MC_area";
		} else {
			return "question/ajax/SC_area";
		}
	}

	@ModelAttribute("questionTypes")
	public List<QuestionType> getAllQuestionTypes() {
		return questionService.getAllQuestionTypes();
	}

}
