package com.putaoteng.task4.test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.putaoteng.task5.dao.UserDao;
import com.putaoteng.task5.model.BasicVo;
import com.putaoteng.task5.model.User;
import com.putaoteng.task5.utils.MD5Encryption;

public class UserDaoTest {

	@Resource (name="userDao")
	private UserDao userDao;
	
	@Before
	public void setUp(){
		@SuppressWarnings("resource")
		ApplicationContext context =
				new ClassPathXmlApplicationContext("application-context.xml");
		userDao = (UserDao) context.getBean("userDao");
	}
	
	@Test
	public void saveTest() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		User user = new User();
		user.setUserName(MD5Encryption.EncoderByMd5("zhangsan"));
		user.setPassword(MD5Encryption.EncoderByMd5("123456"));
		user.setCreateAt(System.currentTimeMillis());
		user.setLoginAt(System.currentTimeMillis());
	
		System.out.println(userDao.toString());
		int result = userDao.save(user);
		System.out.println(result);
	}

	
	@Test
	public void saveBatchTest() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		
		List<BasicVo> list = new ArrayList<BasicVo>();
		
		User user1 = new User();
		user1.setUserName(MD5Encryption.EncoderByMd5("lisi"));
		user1.setPassword(MD5Encryption.EncoderByMd5("wahaha"));
		user1.setCreateAt(System.currentTimeMillis());
		user1.setLoginAt(System.currentTimeMillis());
		list.add(user1);
		
		User user2 = new User();
		user2.setUserName(MD5Encryption.EncoderByMd5("wangwu"));
		user2.setPassword(MD5Encryption.EncoderByMd5("888888"));
		user2.setCreateAt(System.currentTimeMillis());
		user2.setLoginAt(System.currentTimeMillis());
		list.add(user2);
		
		User user3 = new User();
		user3.setUserName(MD5Encryption.EncoderByMd5("admin"));
		user3.setPassword(MD5Encryption.EncoderByMd5("password"));
		user3.setCreateAt(System.currentTimeMillis());
		user3.setLoginAt(System.currentTimeMillis());
		list.add(user3);
		
		int result = userDao.saveBatch(list);
		System.out.println(result);
	}
	
	@Test
	public void updateTest(){
		User user = (User) userDao.findByPK(2L);
		
		user.setPassword("helloworld");
	
		int result = userDao.update(user);
		System.out.println(result);
	}
	
	
	@Test
	public void updateBachTest(){
		List<BasicVo> list = new ArrayList<BasicVo>();
		list = userDao.findAll();
		
		User user1 = (User) list.get(0);
		user1.setPassword("奥特曼");
		User user2 = (User) list.get(1);
		user2.setPassword("小怪兽");
		
		int result = userDao.updateBatch(list);
		System.out.println(result);
	}
	
	@Test
	public void deleteTest(){
		User user = (User) userDao.findByPK(2L);
		int result = userDao.delete(user);
		System.out.println(result);
	}
	
	@Test
	public void deleteByPKTest(){
		int result = userDao.deleteByPK(4L);
		System.out.println(result);
	}
	

	@Test
	public void deleteBach(){
		List<BasicVo> list = new ArrayList<BasicVo>();
		list = userDao.findAll();
		
		int result = userDao.deleteBatch(list);
		System.out.println(result);
	}
	
	@Test
	public void deleteAllTest(){
		int result = userDao.deleteAll();
		System.out.println(result);
	}
	
	@Test
	public void countTest(){
		long result = userDao.count();
		System.out.println(result);
	}
	
	@Test
	public void findByPKTest(){
		long id = 2;
		User user = (User) userDao.findByPK(id);
		
		System.out.println(user.toString());
	}
}
