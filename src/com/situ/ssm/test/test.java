package com.situ.ssm.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fasterxml.jackson.core.sym.Name;
import com.situ.ssm.dao.StudentDao;
import com.situ.ssm.entity.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class test {
	@Autowired
	
	private StudentDao studentDao ;
//	@Test
//	public void  test() {
//		List<Student> list = studentDao.findByName("li");
//		for (Student student : list) {
//			System.out.println(student);
//		}
//	}
	@Test
	public void  test1() {
		List<Student> list = studentDao.findByName("student","li");
		for (Student student : list) {
			System.out.println(student);
		}
	}
}
