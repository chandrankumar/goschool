package com.primary.goschool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.primary.goschool.dao.StudentDao;
import com.primary.goschool.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao StudentDao;
	
	@Override
	public Student saveStudent(Student student) {
		return StudentDao.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return StudentDao.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return StudentDao.findAll();
	}
	
	@Override
	public Student getStudentById(Long studentId) {
		return StudentDao.findById(studentId).get();
	}

	@Override
	public void deleteStudent(Long studentId) {
		StudentDao.deleteById(studentId);
	}


}
