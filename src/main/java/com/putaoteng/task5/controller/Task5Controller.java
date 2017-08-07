package com.putaoteng.task5.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.putaoteng.task5.dao.ExcellentStudentDao;
import com.putaoteng.task5.dao.ProfessionDao;
import com.putaoteng.task5.dao.UserDao;
import com.putaoteng.task5.model.BasicVo;
import com.putaoteng.task5.model.Profession;
import com.putaoteng.task5.model.User;
import com.putaoteng.task5.utils.AutoAuthenticate;
import com.putaoteng.task5.utils.CookieUtils;
import com.putaoteng.task5.utils.MD5Encryption;

@Controller
public class Task5Controller {

	@Resource(name = "excellentStudentDao")
	private ExcellentStudentDao excellentStudentDao;
	@Resource(name = "professionDao")
	private ProfessionDao professionDao;
	@Resource(name = "userDao")
	private UserDao userDao;

	//在dispatcher中直接配置转发,所以这里不用再写控制器
	/*@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String start() {

		return "index";
	}*/

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homePage(Model model) {
		List<BasicVo> list = new ArrayList<BasicVo>();
		list = excellentStudentDao.findAll();

		model.addAttribute("excellentStudentList", list);

		return "home";
	}

	@RequestMapping(value = "/u/profession", method = RequestMethod.GET)
	public String professionPage(Model model) {
		List<BasicVo> list = new ArrayList<BasicVo>();
		list = professionDao.findAll();

		model.addAttribute("professionList", list);
		model.addAttribute("listLength", list.size());

		return "profession";
	}

	@RequestMapping(value = "/u/front", method = RequestMethod.GET)
	public String frontPage(Model model) {
		List<BasicVo> list = new ArrayList<BasicVo>();
		list = professionDao.findAll();

		Profession profession = null;
		Iterator<BasicVo> iterator = list.iterator();
		while (iterator.hasNext()) {
			profession = (Profession) iterator.next();
			if (!("CSS".equals(profession.getProfession()) || "js".equals(profession.getProfession())))
				iterator.remove();
		}

		model.addAttribute("professionList", list);
		model.addAttribute("listLength", list.size());

		return "front";
	}

	@RequestMapping(value = "/u/test", method = RequestMethod.GET)
	public String tagTest(Model model) {
		Profession profession = (Profession) professionDao.findByPK(32L);
		long nowTime = System.currentTimeMillis();

		model.addAttribute("profession", profession);
		model.addAttribute("nowTime", nowTime);

		return "test";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPage(HttpServletRequest request, HttpServletResponse response, String username, String password)
			throws NoSuchAlgorithmException, ServletException, IOException {

		String fullUrl = request.getHeader("Referer");
		//根据用户名在数据库中查找数据
		User user = (User) userDao.findByUsername(MD5Encryption.EncoderByMd5(username));

		// 如果不为空,再判断输入的密码和数据库中的密码是否相同
		if (user != null) {
			// 如果匹配则判断密码是否相同,相同则跳回到原来的页面,否则就再判断一次
			if (user.getPassword().equals(MD5Encryption.EncoderByMd5(password))) {
				// 更新登录时间
				user.setLoginAt(System.currentTimeMillis());
				userDao.update(user);

				//添加自动认证(完成任务,所以不同的url采用了不同的认证方式,实际使用一种就好)
				int index = fullUrl.lastIndexOf("/");
				if (fullUrl.substring(index).equals("/profession")) {
					// cookie实现方式
					AutoAuthenticate.cookieAuthenticate(response, username, user.getLoginAt() + "");

				} else {
					// Session 实现方式
					AutoAuthenticate.sessionAuthenticate(request);
				}
			}
			return "redirect:" + fullUrl;
		}
		request.getSession().setAttribute("path", fullUrl);
		return "registration";
	}

	@RequestMapping(value = "/u/loginout", method = RequestMethod.GET)
	public String logoutTest(HttpServletRequest request, HttpServletResponse response, Model model) {
		//删除cookie
		CookieUtils.deleteCookieByName(request, response, "username");
		CookieUtils.deleteCookieByName(request, response, "loginTime");
		CookieUtils.deleteCookieByName(request, response, "encry");

		//清空session
		HttpSession session = request.getSession();
		session.setAttribute("isLogin", "false");
		session.setMaxInactiveInterval(0);

		return "bye";
	}

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String registrationTest(HttpServletRequest request, HttpServletResponse response, Model model,
			String username, String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		
		String encryUsername = MD5Encryption.EncoderByMd5(username);
		String encryPassword = MD5Encryption.EncoderByMd5(password);
		User user = new User();
		user.setUserName(encryUsername);
		user.setPassword(encryPassword);
		user.setCreateAt(System.currentTimeMillis());
		user.setLoginAt(System.currentTimeMillis());
		userDao.save(user);
		String fullUrl = (String) request.getSession().getAttribute("path");

		//注册成功添加自动认证
		int index = fullUrl.lastIndexOf("/");
		if (fullUrl.substring(index).equals("/profession")) {
			AutoAuthenticate.cookieAuthenticate(response, username, user.getLoginAt() + "");

		} else {
			AutoAuthenticate.sessionAuthenticate(request);
		}
		
		
		return "redirect:" + fullUrl;
	}

}
