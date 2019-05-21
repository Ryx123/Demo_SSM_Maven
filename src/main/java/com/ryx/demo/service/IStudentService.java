package com.ryx.demo.service;

import java.util.List;

import com.ryx.demo.po.Student;

public interface IStudentService {

	public List<Student> queryStudentList();
	
	public Student queryStudentById(int sid);
	
	public int addStudent(Student student);
	
	public int updateStudent(Student student);
	
	public int deleteStudent(int sid);
	
}
