package com.primary.goschool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.primary.goschool.dao.SubjectDao;
import com.primary.goschool.model.Subject;

@Service
public class SubjectServiceImpl implements SubjectService {

	@Autowired
	SubjectDao subjectDao;

	@Override
	public Subject saveSubject(Subject subject) {
		return subjectDao.save(subject);
	}

	@Override
	public Subject updateSubject(Subject subject) {
		return subjectDao.save(subject);
	}

	@Override
	public List<Subject> getAllSubject() {
		return subjectDao.findAll();
	}

	@Override
	public Subject getSubjectById(Long subjectId) {
		return subjectDao.findById(subjectId).get();
	}

	@Override
	public void deleteSubject(Long subjectId) {
		subjectDao.deleteById(subjectId);
	}

}
