package com.primary.goschool.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primary.goschool.model.Student;

public interface StudentDao extends JpaRepository<Student, Long>{

}
