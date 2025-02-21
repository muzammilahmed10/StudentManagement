package com.web.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.demo.entites.Student;
import com.web.demo.repositories.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository sturepo;
	
	public Student onboardStudent(Student stu) {
		return sturepo.save(stu);
	}
	
	public Student getStudent(int id) {
		return sturepo.findById(id).get();
	}
	
	public List<Student> getAllStudent() {
		return sturepo.findAll();
	}
	
	public Student updateStudent(Student stu) {
		return sturepo.save(stu);
	}
	
	public String deleteStudent(int id) {
		sturepo.deleteById(id);
		return "Student with "+id+" has been successfully deleted.";
	}
	
	
}
