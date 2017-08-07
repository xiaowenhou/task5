package com.putaoteng.task5.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtils {
	
	/**
	 * 添加一个cookie
	 * 
	 * @param response HttpServletResponse
	 * @param cookie	new cookie.
	 * 
	 * @return null
	 * 
	 */
	public static void addCookie(HttpServletResponse response, Cookie cookie){
		response.addCookie(cookie);
		return ;
	}
	
	/**
	 * 创建并添加一个新cookie
	 * 
	 * @param response 		HttpServletResponse
	 * @param cookieName	the name of cookie. 
	 * @param cookieValue	the value of cookie.
	 * @param cookieDomain	the domain of cookie.
	 * @param cookiePath	the path of cookie.
	 * @param maxAge		the maxAge of cookie.
	 * @param secure	 	is HTTPS?
	 * 
	 * @return null
	 */
	public static void addCookie(HttpServletResponse response, String cookieName,
						String cookieValue, String cookieDomain, String cookiePath,
						int maxAge, boolean secure){
		if (cookieName != null && !cookieName.equals("")){
			if (cookieValue == null){
				cookieValue = "";
			}
			
			Cookie newCookie = new Cookie(cookieName, cookieValue);
			if (cookieDomain != null)
				newCookie.setDomain(cookieDomain);
			
			if (maxAge > 0)
				newCookie.setMaxAge(maxAge);
			
			newCookie.setSecure(secure);
			
			if (cookiePath != null)
				newCookie.setPath(cookiePath);
			else
				newCookie.setPath("/");
			
			addCookie(response, newCookie);
		}
	}
	
	/**
	 * 以默认的方式创建并添加一个新cookie
	 * 
	 * @param response 		HttpServletResponse
	 * @param cookieName	the name of cookie. 
	 * @param cookieValue	the value of cookie.
	 * @param cookieDomain	the domain of cookie.
	 * 
	 * @return null
	 */
	public static void addCookie(HttpServletResponse response, String cookieName,
						String cookieValue, String cookieDomain){
		addCookie(response, cookieName, cookieValue, cookieDomain, "/", 60, false);
	}
	
	/**
	 * 根据Cookie名获取相应的Cookie
	 * 
	 * @param request HttpServletRequest
	 * @param cookieName cookie名称
	 * 
	 * @return 获取到的cookie对象
	 */
	public static Cookie getCookie(HttpServletRequest request, String cookieName){
		Cookie[] cookies = request.getCookies();
		
		if (cookieName == null || cookieName.equals("") || cookies == null)
			return null;
		
		for (Cookie cookie : cookies) {
			if (cookieName.equals(cookie.getName()))
				return (Cookie)cookie;
		}
		
		return null;
	}
	
	/**
	 * 根据cookie名获取相应的cookie值
	 * 
	 * @param request		HttpServletRequest
	 * @param cookieName	cookie名称
	 * 
	 * @return cookie名对应的cookie值
	 */
	public static String getCookieValue(HttpServletRequest request, String cookieName){
		Cookie cookie = getCookie(request, cookieName);
		
		if (cookie == null)
			return null;
		else{
			return cookie.getValue();
		}
		
	}
	
	/**
	 * 删除指定的cookie
	 * 
	 * @param response		HttpServletResponse
	 * @param cookie		要删除的cookie 
	 * 
	 * @return	null
	 */
	public static void deleteCookie(HttpServletResponse response, Cookie cookie){
		if (cookie != null){
			cookie.setPath("/");
			cookie.setMaxAge(0);
			cookie.setValue(null);
		}
		
		response.addCookie(cookie);
	}
	
	/**
	 * 通过cookie名删除指定的cookie
	 * 
	 * @param request		HttpServletRequest
	 * @param response		HttpServletResponse
	 * @param cookieName	cookie名
	 * 
	 * @return	null
	 */
	public static void deleteCookieByName(HttpServletRequest request, 
						HttpServletResponse response, String cookieName){
			Cookie cookie = getCookie(request, cookieName);
			if (cookie != null && cookie.getName().equals(cookieName))
				deleteCookie(response, cookie);
	}
	
	/**
	 * 根据cookie名修改指定的cookie
	 * 
	 * @param request		HttpServletRequest
	 * @param response		HttpServletResponse
	 * @param cookieName	cookie名
	 * @param cookieValue	修改之后的cookie值
	 * @param cookieDomain	修改之后的cookie域名
	 * 
	 * @return	null
	 */
	public static void editCookie(HttpServletRequest request, HttpServletResponse response,
						String cookieName, String cookieValue, String cookieDomain){
		Cookie cookie = getCookie(request, cookieName);
		
		if (cookie != null && cookieName != null && !cookieName.equals("") && 
				cookie.getName().equals(cookieName)){
			addCookie(response, cookieName, cookieValue, cookieDomain);
		}
	}
}
