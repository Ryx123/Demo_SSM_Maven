package com.ryx.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ryx.demo.po.Student;

public interface StudentMapper {

	List<Student> queryStudentList();
	
	Student queryStudentById(@Param("id")int sid);
	
	int addStudent(Student student);
	
	int updateStudent(Student student);
	
	int deleteStudent(int sid);
	
}
