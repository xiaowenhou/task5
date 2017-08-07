package com.putaoteng.task4.test;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.putaoteng.task5.dao.StudentDao;
import com.putaoteng.task5.model.BasicVo;
import com.putaoteng.task5.model.Student;

public class StudentTest {

	@Resource (name="studentDao")
	private StudentDao studentDao;
	
	@Before
	public void setUp(){
		@SuppressWarnings("resource")
		ApplicationContext context =
				new ClassPathXmlApplicationContext("application-context.xml");
		studentDao = (StudentDao) context.getBean("studentDao");
	}
	
	@Test
	public void saveTest() {
		Student student = new Student();
		
//		student.setId(1);
		student.setName("xiuzhenyuan");
		student.setQqNumber(123456789);
		student.setProfession("java");
		student.setJoinDate("2017年1月1日");
		student.setSchool("家里蹲");
		student.setOnlineNumber("9527");
		student.setDailyLink("www.baidu.com");
		student.setDesire("牛鼻");
		student.setMsgSource("知乎");
		student.setBrother("小师弟兄");
		student.setCreateAt(20170715133333L);
		student.setUpdateAt(20170715133356L);
	
		System.out.println(studentDao.toString());
		int result = studentDao.save(student);
		System.out.println(result);
	}

	
	@Test
	public void saveBatchTest() {
		
		List<BasicVo> list = new ArrayList<BasicVo>();
		
		Student student = new Student();
//		student.setId(1);
		student.setName("xiuzhenyuan");
		student.setQqNumber(123456789);
		student.setProfession("java");
		student.setJoinDate("2017年1月1日");
		student.setSchool("家里蹲");
		student.setOnlineNumber("9527");
		student.setDailyLink("www.baidu.com");
		student.setDesire("牛鼻");
		student.setMsgSource("知乎");
		student.setBrother("小师弟兄");
		student.setCreateAt(20170715133333L);
		student.setUpdateAt(20170715133356L);
		list.add(student);
		
		Student student2 = new Student();
		student2.setName("wahahah");
		student2.setQqNumber(123456789);
		student2.setProfession("java");
		student2.setJoinDate("2017年1月1日");
		student2.setSchool("家里蹲");
		student2.setOnlineNumber("9527");
		student2.setDailyLink("www.baidu.com");
		student2.setDesire("牛鼻");
		student2.setMsgSource("知乎");
		student2.setBrother("小师弟兄");
		student2.setCreateAt(20170715133333L);
		student2.setUpdateAt(20170715133356L);
		list.add(student2);
		
		
		int result = studentDao.saveBatch(list);
		System.out.println(result);
	}
	
	@Test
	public void updateTest(){
		Student student = new Student();
		student.setId(1);
		student.setName("xiaowenhou");
		student.setQqNumber(123456789);
		student.setProfession("java");
		student.setJoinDate("2017年1月1日");
		student.setSchool("家里蹲");
		student.setOnlineNumber("9527");
		student.setDailyLink("www.baidu.com");
		student.setDesire("牛鼻");
		student.setMsgSource("知乎");
		student.setBrother("小师弟兄");
		student.setCreateAt(20170715133333L);
		student.setUpdateAt(20170715133356L);
	
		int result = studentDao.update(student);
		System.out.println(result);
	}
	
	
	@Test
	public void updateBachTest(){
		List<BasicVo> list = new ArrayList<BasicVo>();
		list = studentDao.findAll();
		
		Student student1 = (Student) list.get(0);
		student1.setName("奥特曼");
		Student student2 = (Student) list.get(1);
		student2.setName("小怪兽");
		
		int result = studentDao.updateBatch(list);
		System.out.println(result);
	}
	
	@Test
	public void deleteTest(){
		Student student = new Student();
		student.setId(1);
		student.setName("xiuzhenyuan");
		student.setQqNumber(123456789);
		student.setProfession("java");
		student.setJoinDate("2017年1月1日");
		student.setSchool("家里蹲");
		student.setOnlineNumber("9527");
		student.setDailyLink("www.baidu.com");
		student.setDesire("牛鼻");
		student.setMsgSource("知乎");
		student.setBrother("小师弟兄");
		student.setCreateAt(20170715133333L);
		student.setUpdateAt(20170715133356L);
		
		int result = studentDao.delete(student);
		System.out.println(result);
	}
	
	@Test
	public void deleteByPKTest(){
		int result = studentDao.deleteByPK(10L);
		System.out.println(result);
	}
	

	@Test
	public void deleteBach(){
		List<BasicVo> list = new ArrayList<BasicVo>();
		list = studentDao.findAll();
		
		int result = studentDao.deleteBatch(list);
		System.out.println(result);
	}
	
	@Test
	public void deleteAllTest(){
		int result = studentDao.deleteAll();
		System.out.println(result);
	}
	
	@Test
	public void countTest(){
		long result = studentDao.count();
		System.out.println(result);
	}
	
	@Test
	public void findByPKTest(){
		long id = 14;
		Student student = (Student) studentDao.findByPK(id);
		
		System.out.println(student.toString());
	}
}
