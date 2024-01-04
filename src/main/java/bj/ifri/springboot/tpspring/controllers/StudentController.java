package bj.ifri.springboot.tpspring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bj.ifri.springboot.tpspring.models.Student;
import bj.ifri.springboot.tpspring.models.University;
import bj.ifri.springboot.tpspring.repositories.StudentRepository;
import bj.ifri.springboot.tpspring.repositories.UniversityRepository;

@RestController
@RequestMapping(value = "/api/students")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private UniversityRepository univRepository;

	@GetMapping("/list")
	public List<Student> listStudents() {

		return studentRepository.findAll();

	}

	@GetMapping("find/{idUniverisite}")
	public List<Student> findByUniversityId(@PathVariable("idUniverisite") String idUniverisite) {

		return this.studentRepository.findByUniversiteId(Long.valueOf(idUniverisite));
	}

	@GetMapping("/universities")
	public List<University> listUniversities() {
		System.out.println(univRepository.count());
		return univRepository.findAll();
	}

}
