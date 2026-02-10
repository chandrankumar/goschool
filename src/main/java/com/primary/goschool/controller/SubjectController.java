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

import com.primary.goschool.model.Subject;
import com.primary.goschool.service.SubjectService;

@RestController
@RequestMapping("/api/subject")
public class SubjectController {

	private static final Logger logger = LoggerFactory.getLogger(SubjectController.class);

	@Autowired
	SubjectService subjectService;

	@PostMapping("/create")
	public ResponseEntity<Subject> createSubject(@RequestBody Subject subject) {
		logger.info("CreateSubject subject name: {}", subject.getSubjectName());
		return ResponseEntity.ok(subjectService.saveSubject(subject));
	}

	@PutMapping("/amend")
	public ResponseEntity<Subject> amendSubject(@RequestBody Subject subject) {
		logger.info("UpdateSubject SubjectId:{}", subject.getId());
		return ResponseEntity.ok(subjectService.updateSubject(subject));
	}

	@GetMapping("/")
	public ResponseEntity<List<Subject>> getAllSubject() {
		logger.info("Retrieve AllSubject");
		return ResponseEntity.ok(subjectService.getAllSubject());
	}

	@GetMapping("/{subjectId}")
	public ResponseEntity<Subject> getSubject(@PathVariable Long subjectId) {
		logger.info("Retrieve SubjectId :{}", subjectId);
		return ResponseEntity.ok(subjectService.getSubjectById(subjectId));
	}

	@DeleteMapping("/remove/{subjectId}")
	public void deleteSubject(@PathVariable Long subjectId) {
		logger.info("Deleting SubjectId:{}", subjectId);
		subjectService.deleteSubject(subjectId);
	}

}
