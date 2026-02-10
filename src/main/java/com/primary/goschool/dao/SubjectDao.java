package com.primary.goschool.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primary.goschool.model.Subject;

public interface SubjectDao extends JpaRepository<Subject, Long>{

}
