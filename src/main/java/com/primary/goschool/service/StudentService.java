package com.primary.goschool.service;

import java.util.List;

import com.primary.goschool.model.Student;

public interface StudentService {
	
	Student saveStudent(Student student);

	Student updateStudent(Student student);

	List<Student> getAllStudents();

	Student getStudentById(Long id);

	void deleteStudent(Long id);

}
