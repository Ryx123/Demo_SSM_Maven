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
	 * 查询所有学生
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/queryStudentList",produces = "text/plain;charset=UTF-8")
	public String queryStudentList() {
		List<Student> list = service.queryStudentList();
		return JSON.toJSONString(list);
	}
	
	/**
	 * 通过id查询学生
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/queryStudentById",produces = "text/plain;charset=UTF-8")
	public String queryStudentById() {
		Student student = service.queryStudentById(1002);
		return JSON.toJSONString(student);
	}
	
	
	/**
	 * 添加学生信息
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/addStudent",produces = "text/plain;charset=UTF-8")
	public String addStudent() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Student student = new Student("测试员", "四川成都",sdf.format(new Date()));
		int i = service.addStudent(student);
		return "添加成功";
	}
	
	/**
	 * 修改学生信息
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/updateStudent",produces = "text/plain;charset=UTF-8")
	public String updateStudent() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Student student = new Student(1006, "测试专员", "西藏拉萨",sdf.format(new Date()));
		int i = service.updateStudent(student);
		return "修改成功";
	}
	
	/**
	 * 删除学生信息
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/deleteStudent",produces = "text/plain;charset=UTF-8")
	public String deleteStudent() {
		int i = service.deleteStudent(1006);
		return "删除成功";
	}
	

	
	
}
