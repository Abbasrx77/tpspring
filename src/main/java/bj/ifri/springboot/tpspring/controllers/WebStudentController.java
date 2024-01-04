package bj.ifri.springboot.tpspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import bj.ifri.springboot.tpspring.models.Student;
import bj.ifri.springboot.tpspring.repositories.StudentRepository;
import bj.ifri.springboot.tpspring.repositories.UniversityRepository;

@Controller
@RequestMapping(value = "/etudiant")
public class WebStudentController {

	@Autowired
	private StudentRepository studentRepo;

	@Autowired
	private UniversityRepository universityRepo;

	@GetMapping("/list")
	public String listStudents(Model model) {

		model.addAttribute("students", studentRepo.findAll());
		return "etudiants";
	}

	@GetMapping("/nouveau")
	public String addStudent(Model model) {

		model.addAttribute("schools", universityRepo.findAll());
		model.addAttribute("student", new Student());
		return "ajoutetudiant";
	}

	@PostMapping("/enregistrer")
	public String saveStudent(@ModelAttribute("student") Student student) {

		studentRepo.save(student);

		return "redirect:/etudiant/list";
	}

}
