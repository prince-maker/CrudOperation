package com.sunil.controller;

import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
//[kimport org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunil.dao.StudentRepo;
import com.sunil.exception.InvalidFileException;
import com.sunil.model.Student;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	StudentRepo dao;

	@PostMapping("/create")
	public String upadte(@RequestBody Student std)

	{
		dao.save(std);

		if (StringUtils.isBlank(std.getBranch())) {
			throw new InvalidFileException("Branch is missed, please Enter your branch:");
		}

		return "Student details created successfully:";
	}

	

	@GetMapping("/getStudents")
	public List<Student> read() {
		return (List<Student>) dao.findAll();
	}

	@GetMapping("getStudent{id}")
	public Optional<Student> readById(@PathVariable("id") int id) {
		return dao.findById(id);
	}

	@Value("Hello java") //To add any values

	private String java;

	@DeleteMapping("deleteStudent{id}")
	public String delete(@PathVariable("id") int id) {
		dao.deleteById(id);
		return "Student details deleted:";
	}

	@Value("Hello developer")

	private String App;

	@GetMapping
	public String value() {
		return String.format("value is -> %s %s", App, java); // dispalying all the values here
	}

}
