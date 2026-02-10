package com.primary.goschool.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primary.goschool.model.Student;
import com.primary.goschool.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {

	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

	@Autowired
	StudentService studentService;

	@PostMapping("/create")
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		logger.info("CreateStudent email: {}", student.getEmail());
		return ResponseEntity.ok(studentService.saveStudent(student));
	}

	@PutMapping("/amend")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
		logger.info("UpdateStudent studentId:{}", student.getId());
		return ResponseEntity.ok(studentService.updateStudent(student));
	}

	@GetMapping("/")
	public ResponseEntity<List<Student>> getAllStudent() {
		logger.info("Retrieve AllStudent");
		return ResponseEntity.ok(studentService.getAllStudents());
	}

	@GetMapping("/{studentId}")
	public ResponseEntity<Student> getStudent(@PathVariable Long studentId) {
		logger.info("Retrieve StudentId :{}", studentId);
		return ResponseEntity.ok(studentService.getStudentById(studentId));
	}

	@DeleteMapping("/remove/{studentId}")
	public void deleteStudent(@PathVariable Long studentId) {
		logger.info("Deleting studentId:{}", studentId);
		studentService.deleteStudent(studentId);
	}

}
