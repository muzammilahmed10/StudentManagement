package com.web.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.demo.entites.Student;
import com.web.demo.services.StudentService;

@RestController
@RequestMapping("/stu")
public class StudentController {

	@Autowired
	StudentService stuserv;
	
	@PostMapping("/api/onboardStudent")
	public Student onboardStudent(@RequestBody Student stu) {
		return stuserv.onboardStudent(stu);
	}
	
	@GetMapping("/api/getStudent/{id}")
	public Student getStudent(@PathVariable("id") int id) {
		return stuserv.getStudent(id);
	}
	
	@GetMapping("/api/getAllStudent")
	public List<Student> getAllStudent() {
		return stuserv.getAllStudent();
	}
	
	@PutMapping("/api/updateStudent")
	public Student updateStudent(@RequestBody Student stu) {
		return stuserv.updateStudent(stu);
	}
	
	@DeleteMapping("/api/deleteStudent/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		return stuserv.deleteStudent(id);
	}
}
