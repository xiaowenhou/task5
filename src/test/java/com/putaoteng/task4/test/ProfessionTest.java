package com.putaoteng.task4.test;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.putaoteng.task5.dao.ProfessionDao;
import com.putaoteng.task5.model.Profession;

public class ProfessionTest {
	private ProfessionDao professionDao;
	
	@Before
	public void setUp(){
		@SuppressWarnings("resource")
		ApplicationContext context =
				new ClassPathXmlApplicationContext("application-context.xml");
		professionDao = (ProfessionDao) context.getBean("professionDao");
	}
	
	@Test
	public void saveTest() {
		Date date = new Date();
		
		Profession profession = new Profession();
		profession.setProfession("java");
		profession.setIntroduction("IT界的亲儿子,从出世到现在一直坚挺的中坚职业.");
		profession.setThreshold((byte)5);
		profession.setLevel((byte)5);
		profession.setCycle((byte)7);
		profession.setRequirement(21207);
		profession.setTimeFirst("0-1年");
		profession.setSalaryFirst("6-8K/月");
		profession.setTimeSecond("2-5年");
		profession.setSalarySecond("8-18K/月");
		profession.setTimeThird("5年以上");
		profession.setSalaryThird("20-50K/月");
		profession.setNumber(2204);
		profession.setBase("计算机基础(计算机网络,数据结构,数据库,操作系统,JAVA语法)...");
		long time = date.getTime();
		profession.setCreateAt(time);
		profession.setUpdateAt(time);
		
		int result = professionDao.save(profession);
		System.out.println(result);
		
		Profession profession1 = new Profession();
		profession1.setProfession("CSS");
		profession1.setIntroduction("WEB工程师的必备技能,唯一零门槛入门的技术职业.");
		profession1.setThreshold((byte)1);
		profession1.setLevel((byte)1);
		profession1.setCycle((byte)2);
		profession1.setRequirement(25744);
		profession1.setTimeFirst("0-1年");
		profession1.setSalaryFirst("5-10K/月");
		profession1.setTimeSecond("1-3年");
		profession1.setSalarySecond("10-20K/月");
//		profession1.setTimeThird("5年以上");
//		profession1.setSalaryThird("20-50K/月");
//		profession1.setSalaryThird("");
		profession1.setNumber(4041);
		profession1.setBase("无");
		time = date.getTime();
		profession1.setCreateAt(time);
		profession1.setUpdateAt(time);
		result = professionDao.save(profession1);
		System.out.println(result);
		
		Profession profession2 = new Profession();
		profession2.setProfession("js");
		profession2.setIntroduction("最疯狂的低门槛高薪水职业,从前端到后台无所不能");
		profession2.setThreshold((byte)1);
		profession2.setLevel((byte)3);
		profession2.setCycle((byte)5);
		profession2.setRequirement(12980);
		profession2.setTimeFirst("0-1年");
		profession2.setSalaryFirst("3-6K/月");
		profession2.setTimeSecond("1-3年");
		profession2.setSalarySecond("6-12K/月");
		profession2.setTimeThird("3年以上");
		profession2.setSalaryThird("12-40K/月");
		profession2.setNumber(775);
		profession2.setBase("要么是会了CSS,要么是精通一种后端语言,千万不要CSS没学号,后端知识没掌握,就直接学js");
		time = date.getTime();
		profession2.setCreateAt(time);
		profession2.setUpdateAt(time);
		result = professionDao.save(profession2);
		System.out.println(result);
		
		Profession profession3 = new Profession();
		profession3.setProfession("android");
		profession3.setIntroduction("这个世界上最流行的手机操作系统,Android大显神威.");
		profession3.setThreshold((byte)3);
		profession3.setLevel((byte)3);
		profession3.setCycle((byte)1);
		profession3.setRequirement(16707);
		profession3.setTimeFirst("0-1年");
		profession3.setSalaryFirst("5-8K/月");
		profession3.setTimeSecond("1-3年");
		profession3.setSalarySecond("8-18K/月");
		profession3.setTimeThird("3年以上");
		profession3.setSalaryThird("18-35K/月");
		profession3.setNumber(509);
		profession3.setBase("java基础");
		time = date.getTime();
		profession3.setCreateAt(time);
		profession3.setUpdateAt(time);
		result = professionDao.save(profession3);
		System.out.println(result);
		
		Profession profession4 = new Profession();
		profession4.setProfession("ios");
		profession4.setIntroduction("最近几年互联网前端开发的新贵,高冷职业的代表");
		profession4.setThreshold((byte)3);
		profession4.setLevel((byte)3);
		profession4.setCycle((byte)3);
		profession4.setRequirement(6600);
		profession4.setTimeFirst("0-1年");
		profession4.setSalaryFirst("6-8K/月");
		profession4.setTimeSecond("1-3年");
		profession4.setSalarySecond("8-18K/月");
		profession4.setTimeThird("3年以上");
		profession4.setSalaryThird("18-35K/月");
		profession4.setNumber(509);
		profession4.setBase("计算机基础");
		time = date.getTime();
		profession4.setCreateAt(time);
		profession4.setUpdateAt(time);
		result = professionDao.save(profession4);
		System.out.println(result);
		
		Profession profession5 = new Profession();
		profession5.setProfession("op");
		profession5.setIntroduction("越来越重要的岗位,\"云服务和安全\"必备职业");
		profession5.setThreshold((byte)2);
		profession5.setLevel((byte)1);
		profession5.setCycle((byte)2);
		profession5.setRequirement(25744);
		profession5.setTimeFirst("0-1年");
		profession5.setSalaryFirst("6-8K/月");
		profession5.setTimeSecond("1-3年");
		profession5.setSalarySecond("8-18K/月");
//		profession5.setTimeThird("5年以上");
//		profession5.setSalaryThird("20-50K/月");
		profession5.setNumber(270);
		profession5.setBase("OP的门槛其实并没有太高,经常玩玩Linux会好一些,但是要学的东西,确实很多");
		time = date.getTime();
		profession5.setCreateAt(time);
		profession5.setUpdateAt(time);
		result = professionDao.save(profession5);
		System.out.println(result);
		
		Profession profession6 = new Profession();
		profession6.setProfession("pm");
		profession6.setIntroduction("入门门槛最低,却是成为CEO的最佳职位");
		profession6.setThreshold((byte)1);
		profession6.setLevel((byte)3);
		profession6.setCycle((byte)5);
		profession6.setRequirement(23614);
		profession6.setTimeFirst("0-2年");
		profession6.setSalaryFirst("6-15K/月");
		profession6.setTimeSecond("2-4年");
		profession6.setSalarySecond("12-25K/月");
		profession6.setTimeThird("4年以上");
		profession6.setSalaryThird("20-50K/月");
		profession6.setNumber(729);
		profession6.setBase("无(甚至你可以不识字)");
		time = date.getTime();
		profession6.setCreateAt(time);
		profession6.setUpdateAt(time);
		result = professionDao.save(profession6);
		System.out.println(result);
		
		Profession profession7 = new Profession();
		profession7.setProfession("ui");
		profession7.setIntroduction("最近几年互联网前端开发的新贵,高冷职业的代表");
		profession7.setThreshold((byte)3);
		profession7.setLevel((byte)3);
		profession7.setCycle((byte)3);
		profession7.setRequirement(6600);
		profession7.setTimeFirst("0-1年");
		profession7.setSalaryFirst("6-8K/月");
		profession7.setTimeSecond("1-3年");
		profession7.setSalarySecond("8-18K/月");
		profession7.setTimeThird("3年以上");
		profession7.setSalaryThird("18-35K/月");
		profession7.setNumber(218);
		profession7.setBase("UI对入门门槛要求还算是比较高的。首先你得有一台Mac。。大部分的情况下你都需要Mac。然后你要懂之前提到的常用软件，UI的交互规范，配色等等等。。");
		time = date.getTime();
		profession7.setCreateAt(time);
		profession7.setUpdateAt(time);
		result = professionDao.save(profession7);
		System.out.println(result);
		
		Profession profession8 = new Profession();
		profession8.setProfession("qa");
		profession8.setIntroduction("项目的守护神");
		profession8.setThreshold((byte)1);
		profession8.setLevel((byte)1);
		profession8.setCycle((byte)3);
		profession8.setRequirement(32458);
		profession8.setTimeFirst("0-2年");
		profession8.setSalaryFirst("6-10K/月");
		profession8.setTimeSecond("2-4年");
		profession8.setSalarySecond("8-16K/月");
		profession8.setTimeThird("4年以上");
		profession8.setSalaryThird("15-25K/月");
		profession8.setNumber(80);
		profession8.setBase("无");
		time = date.getTime();
		profession8.setCreateAt(time);
		profession8.setUpdateAt(time);
		result = professionDao.save(profession8);
		System.out.println(result);
		
		Profession profession9 = new Profession();
		profession9.setProfession("求职辅导");
		profession9.setIntroduction("这么久了还没有找到工作？需要简历和面试辅导吗。修真院老大亲自出马，一对一简历与面试辅导，助你成功入职！");
		profession9.setThreshold((byte)1);
		profession9.setLevel((byte)1);
		profession9.setCycle((byte)1);
//		profession9.setRequirement();
		profession9.setTimeFirst("1-2周");
		profession9.setSalaryFirst("2K/月");
		profession9.setNumber(80);
		profession9.setBase("无");
		time = date.getTime();
		profession9.setCreateAt(time);
		profession9.setUpdateAt(time);
		result = professionDao.save(profession9);
		System.out.println(result);
	}

	
	
	@Test
	public void updateTest(){
		Profession profession = (Profession) professionDao.findByPK(11L);
		
		profession.setBase("牛逼");
	
		int result = professionDao.update(profession);
		System.out.println(result);
	}
	
	@Test
	public void deleteTest(){
		Profession profession8 = new Profession();
		profession8.setId(10L);
		profession8.setProfession("qa");
		profession8.setIntroduction("项目的守护神");
		profession8.setThreshold((byte)1);
		profession8.setLevel((byte)1);
		profession8.setCycle((byte)3);
		profession8.setRequirement(32458);
		profession8.setSalaryFirst("0-2年			6-10K/月");
		profession8.setSalarySecond("2-4年			8-16K/月");
		profession8.setSalaryThird("4年以上			15-25K/月");
		profession8.setNumber(80);
		profession8.setBase("无");
		profession8.setCreateAt(20170731114434L);
		profession8.setUpdateAt(20170731114434L);
		
		int result = professionDao.delete(profession8);
		System.out.println(result);
	}
	
	@Test
	public void deleteByPKTest(){
		int result = professionDao.deleteByPK(1L);
		System.out.println(result);
	}
	
	@Test
	public void deleteAllTest(){
		int result = professionDao.deleteAll();
		System.out.println(result);
	}
	
	@Test
	public void countTest(){
		long result = professionDao.count();
		System.out.println(result);
	}
	
	@Test
	public void findByPKTest(){
		long id = 1;
		Profession pd = (Profession) professionDao.findByPK(id);
		
		System.out.println(pd.toString());
	}
	
	@Test
	public void dateTest(){
		Date date = new Date();
		
		long time = date.getTime();
		
		System.out.println(date.toString());
		System.out.println(time);
	}
	
	
}
