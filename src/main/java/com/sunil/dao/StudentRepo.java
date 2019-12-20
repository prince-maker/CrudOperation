package com.sunil.dao;

import org.springframework.data.repository.CrudRepository;

import com.sunil.model.Student;

public interface StudentRepo  extends CrudRepository<Student,Integer>{

}
