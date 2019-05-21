package com.ryx.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ryx.demo.dao.StudentMapper;
import com.ryx.demo.po.Student;
import com.ryx.demo.service.IStudentService;

@Service
@Transactional
public class StudentServiceImpl implements IStudentService{

	@Autowired
	StudentMapper mapper;
	
	@Override
	public List<Student> queryStudentList() {
		// TODO Auto-generated method stub
		return mapper.queryStudentList();
	}

	@Override
	public Student queryStudentById(int sid) {
		// TODO Auto-generated method stub
		return mapper.queryStudentById(sid);
	}

	@Override
	public int addStudent(Student student) {
		// TODO Auto-generated method stub
		return mapper.addStudent(student);
	}

	@Override
	public int updateStudent(Student student) {
		// TODO Auto-generated method stub
		return mapper.updateStudent(student);
	}

	@Override
	public int deleteStudent(int sid) {
		// TODO Auto-generated method stub
		return mapper.deleteStudent(sid);
	}
}
