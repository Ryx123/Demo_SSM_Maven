package com.ryx.demo.controller;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.ryx.demo.po.Student;
import com.ryx.demo.service.IStudentService;


@RequestMapping("/student")
@Controller
public class StudentController {

	@Autowired
	public IStudentService service;
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		return "hello,word";
	}
	
	/**
	 * ��ѯ����ѧ��
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/queryStudentList",produces = "text/plain;charset=UTF-8")
	public String queryStudentList() {
		List<Student> list = service.queryStudentList();
		return JSON.toJSONString(list);
	}
	
	/**
	 * ͨ��id��ѯѧ��
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/queryStudentById",produces = "text/plain;charset=UTF-8")
	public String queryStudentById() {
		Student student = service.queryStudentById(1002);
		return JSON.toJSONString(student);
	}
	
	
	/**
	 * ���ѧ����Ϣ
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/addStudent",produces = "text/plain;charset=UTF-8")
	public String addStudent() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Student student = new Student("����Ա", "�Ĵ��ɶ�",sdf.format(new Date()));
		int i = service.addStudent(student);
		return "��ӳɹ�";
	}
	
	/**
	 * �޸�ѧ����Ϣ
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/updateStudent",produces = "text/plain;charset=UTF-8")
	public String updateStudent() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Student student = new Student(1006, "����רԱ", "��������",sdf.format(new Date()));
		int i = service.updateStudent(student);
		return "�޸ĳɹ�";
	}
	
	/**
	 * ɾ��ѧ����Ϣ
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/deleteStudent",produces = "text/plain;charset=UTF-8")
	public String deleteStudent() {
		int i = service.deleteStudent(1006);
		return "ɾ���ɹ�";
	}
	

	
	
}
