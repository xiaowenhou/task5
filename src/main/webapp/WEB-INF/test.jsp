<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="/WEB-INF/tld/date.tld" prefix="mt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TEST</title>

</head>
<body>

	<a href="/u/loginout">退出登陆</a><br><br>

	取出一个数据,该数据的各个内容如下:<br>
	<c:set var="profession" value="${profession }"/><br>
	
	id:&nbsp;&nbsp;<c:out value="${profession.id }"/><br>
	profession:&nbsp;&nbsp;<c:out value="${profession.profession }"/><br>
	introduction:&nbsp;&nbsp;<c:out value="${profession.introduction }"/><br>
	threshold:&nbsp;&nbsp;<c:out value="${profession.threshold }"/><br>
	level:&nbsp;&nbsp;<c:out value="${profession.level }"/><br>
	cycle:&nbsp;&nbsp;<c:out value="${profession.cycle }"/><br>
	requirement:&nbsp;&nbsp;<c:out value="${profession.requirement }"/><br>
	time_first:&nbsp;&nbsp;<c:out value="${profession.timeFirst }"/><br>
	salary_first:&nbsp;&nbsp;<c:out value="${profession.salaryFirst }"/><br>
	time_second:&nbsp;&nbsp;<c:out value="${profession.timeSecond }"/><br>
	salary_second:&nbsp;&nbsp;<c:out value="${profession.salarySecond }"/><br>
	time_third:&nbsp;&nbsp;<c:out value="${profession.timeThird }"/><br>
	salary_third:&nbsp;&nbsp;<c:out value="${profession.salaryThird }"/><br>
	number:&nbsp;&nbsp;<c:out value="${profession.number }"/><br>
	base:&nbsp;&nbsp;<c:out value="${profession.base }"/><br>
	
	
	crate_at:&nbsp;&nbsp;<mt:Date time="${pageScope.profession.createAt}" flag="3"/><br>
	update_at:&nbsp;&nbsp;<mt:Date time="${requestScope.profession.updateAt }" flag="2"/><br>
	
	
	<br>打印当前时间:<br>
	<c:set var="time" value="${nowTime}"/>
	<mt:Date time="${time }" flag="3"></mt:Date>
</body>

</html>
		