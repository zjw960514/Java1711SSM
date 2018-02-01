package com.situ.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.situ.ssm.entity.Student;

public interface StudentDao {
	List<Student> findAll();

	//List<Student> findByName(String name);
	
	List<Student> findByName(@Param("tableName")String tableName , @Param("Name")String name);
}
