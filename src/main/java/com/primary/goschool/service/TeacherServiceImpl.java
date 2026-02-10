package com.primary.goschool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.primary.goschool.dao.TeacherDao;
import com.primary.goschool.model.Teacher;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	TeacherDao teacherDao;

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		
		teacher.getSubject().forEach(t -> t.setTeacher(teacher));
		return teacherDao.save(teacher);
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		return teacherDao.save(teacher);
	}

	@Override
	public List<Teacher> getAllTeacher() {
		return teacherDao.findAll();
	}

	@Override
	public Teacher getTeacherById(Long teacherId) {
		return teacherDao.findById(teacherId).get();
	}

	@Override
	public void deleteTeacher(Long teacherId) {
		teacherDao.deleteById(teacherId);
	}

}
