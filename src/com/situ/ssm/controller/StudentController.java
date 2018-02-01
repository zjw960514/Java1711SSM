package com.situ.ssm.controller;

import java.util.List;

import javax.annotation.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.situ.ssm.entity.Student;
import com.situ.ssm.service.IStudentService;

@Controller
@RequestMapping(value="studentss")
public class StudentController {
	@Autowired
	private IStudentService studentService;
	
	@RequestMapping(value="/studentss",method=RequestMethod.GET)
	@ResponseBody
	public List<Student> list(){
		List<Student> list = studentService.findAll();
		return list;
	}
	
	
	
}
