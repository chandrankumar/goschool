package com.primary.goschool.service;

import java.util.List;

import com.primary.goschool.model.Teacher;

public interface TeacherService {
	
	Teacher saveTeacher(Teacher teacher);

	Teacher updateTeacher(Teacher teacher);

	List<Teacher> getAllTeacher();

	Teacher getTeacherById(Long id);

	void deleteTeacher(Long id);

}
