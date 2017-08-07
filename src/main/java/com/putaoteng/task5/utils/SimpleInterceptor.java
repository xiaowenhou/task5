package com.putaoteng.task5.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class SimpleInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Log.loggerCreate(LogLevel.ERROR, "-------------------------preHandle----------------------");

		//获取cookie中的值
		String username = CookieUtils.getCookieValue(request, "username");
		String loginTime = CookieUtils.getCookieValue(request, "loginTime");
		String encry = CookieUtils.getCookieValue(request, "encry");

		if (username != null && loginTime != null) {
			//按照事先约定好的规则将username和loginTime采用MD5加密,再和第三个cookie的值比较,相同则认证通过,直接返回true
			if (encry.equals(MD5Encryption.EncoderByMd5("["+ username+"$"+"]" + loginTime)))
				return true;
		}

		request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		Log.loggerCreate(LogLevel.ERROR, "-------------------------postHandle----------------------");

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		Log.loggerCreate(LogLevel.ERROR, "-------------------------afterCompletion----------------------");
	}
}
