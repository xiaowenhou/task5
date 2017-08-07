package com.putaoteng.task5.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class SessionInterceptor  implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		
		/*//获取请求行中的资源名部分
		String path = request.getRequestURI();
		Log.loggerCreate(LogLevel.ERROR, "Path............." + path);
		//提取出jsessionid
		int index = path.indexOf("=");
		int index2 = path.lastIndexOf(".");
		String jsessionid = null;
		if (index != -1 && index2 != -1){
			jsessionid = path.substring(index+1, index2);
			Log.loggerCreate(LogLevel.ERROR, "jsessionid..............." + jsessionid);
			//判断当前url中带着的ID是否和当前会话中的sessionID相同
			if (jsessionid.equals(request.getSession().getId())){
				String username = (String) request.getSession().getAttribute("username");
				
				Log.loggerCreate(LogLevel.ERROR, "Session username------------------------------" + username);
				
				if (username != null)
					return true;
			}
		}*/

		//基于cookie的session认证
		String isLogin = (String) request.getSession().getAttribute("isLogin");
		
		if (isLogin != null && isLogin.equals("true")){
			return true;
		}
		
		request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}
	
}
