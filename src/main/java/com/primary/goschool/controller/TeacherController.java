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

import com.primary.goschool.model.Teacher;
import com.primary.goschool.service.TeacherService;

@RestController
@RequestMapping("/api/teacher")
public class TeacherController {

	private static final Logger logger = LoggerFactory.getLogger(TeacherController.class);

	@Autowired
	TeacherService teacherService;

	@PostMapping("/create")
	public ResponseEntity<Teacher> createTeacher(@RequestBody Teacher teacher) {
		logger.info("CreateTeacher email: {}", teacher.getEmail());
		return ResponseEntity.ok(teacherService.saveTeacher(teacher));
	}

	@PutMapping("/amend")
	public ResponseEntity<Teacher> amendTeacher(@RequestBody Teacher teacher) {
		logger.info("UpdateTeacher teacherId:{}", teacher.getId());
		return ResponseEntity.ok(teacherService.updateTeacher(teacher));
	}

	@GetMapping("/")
	public ResponseEntity<List<Teacher>> getAllTeacher() {
		logger.info("Retrieve AllTeacher");
		return ResponseEntity.ok(teacherService.getAllTeacher());
	}

	@GetMapping("/{teacherId}")
	public ResponseEntity<Teacher> getTeacher(@PathVariable Long teacherId) {
		logger.info("Retrieve TeacherId :{}", teacherId);
		return ResponseEntity.ok(teacherService.getTeacherById(teacherId));
	}

	@DeleteMapping("/remove/{teacherId}")
	public void deleteTeacher(@PathVariable Long teacherId) {
		logger.info("Deleting TeacherId:{}", teacherId);
		teacherService.deleteTeacher(teacherId);
	}

}
