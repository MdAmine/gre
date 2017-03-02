package fr.norsys.gre.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

		List<Question> questions = this.questionService.getAll();

		model.addAttribute("questions", questions);

		return "question/index";
	}

	@RequestMapping("/add")
	public String questionAddForm(Model model) {

		Question question = new Question();

		QuestionChoix qc = new QuestionChoix();
		// qc.setContenu("bla bla");
		//
		List<QuestionChoix> list = new ArrayList<QuestionChoix>();
		list.add(qc);
		question.setQuestionChoix(list);

		// question.setContenu("aaa aaaaa");
		model.addAttribute("question", question);

		return "question/add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String questionAdd(Model model, @ModelAttribute("question") Question question) {
		System.out.println("id : " + question.getType().getId());

		for (QuestionChoix qc : question.getQuestionChoix()) {
			System.out.println(qc.isCorrecte() + " - " + qc.getContenu());
		}

		return "question/index";
	}

	@RequestMapping(value = "/add", params = { "addRow" })
	public String addRow(@ModelAttribute("question") Question question) {
		System.out.println("contenu : " + question.getContenu());
		question.getQuestionChoix().add(new QuestionChoix());
		return "question/add";
	}

	@RequestMapping(value = "/add", params = { "removeRow" })
	public String removeRow(Question question, final HttpServletRequest req) {

		final Integer rowId = Integer.valueOf(req.getParameter("removeRow"));
		question.getQuestionChoix().remove(rowId.intValue());
		return "question/add";
	}

	@RequestMapping("/{id}")
	public String questionShow(Model model, @PathVariable("id") Long id) throws TechniqueException {

		Question question = this.questionService.getById(id).get();

		model.addAttribute("question", question);

		System.out.println(question.getQuestionChoix().get(0).getContenu());
		System.out.println(question.getQuestionChoix().get(1).getContenu());

		return "question/show";
	}

	@ModelAttribute("questionTypes")
	public List<QuestionType> getAllQuestionTypes() {
		return this.questionService.getAllQuestionTypes();
	}

	@RequestMapping(value = "/questionDatatable")
	public @ResponseBody List<Question> findAll() {
		return this.questionService.getAll();
	}

}
