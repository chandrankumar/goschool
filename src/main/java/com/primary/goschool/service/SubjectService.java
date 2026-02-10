package com.primary.goschool.service;

import java.util.List;

import com.primary.goschool.model.Subject;

public interface SubjectService {
	
	Subject saveSubject(Subject subject);

	Subject updateSubject(Subject subject);

	List<Subject> getAllSubject();

	Subject getSubjectById(Long id);

	void deleteSubject(Long id);

}
