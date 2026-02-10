package com.primary.goschool.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primary.goschool.model.Teacher;

public interface TeacherDao extends JpaRepository<Teacher, Long>{

}
