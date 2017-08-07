<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<script type="text/javascript">  
	function checkUser(){
		var result=document.getElementById("userid").value;
		var password=document.getElementById("passwordid").value;
		var repassword=document.getElementById("repasswordid").value;
		if (result == ""){
			alert("用户名不能为空");
			return false;
		}	
		if (password == ""){
			alert("密码不能为空");
			return false;
			
		} 
		if (password != repassword){
			alert("两次密码不一致");
		} else{
			return true;
		}
	}
</script>

<html>
<body>
	该用户不存在,请先注册.
	<form name="userForm" action="${pageContext.request.contextPath}/registration"
		method="post" onsubmit="return checkUser();">
		<table width="100%" border="1">
			<tr>
				<c:set var="info" value="${info}" />
				<c:out value="${info}" />

			</tr>
			<tr>
				<td width="100" height="40" align="right">用户名:&nbsp;</td>
				<td><input type="text" value="" class="text2" name="username"
					id="userid"></td>
			</tr>

			<tr>
				<td width="100" height="40" align="right">密&nbsp;&nbsp;码:&nbsp;</td>
				<td><input type="password" value="" class="text2"
					name="password" id="passwordid"></td>
			</tr>
			
			<tr>
				<td width="100" height="40" align="right">确&nbsp;认&nbsp;密&nbsp;码:&nbsp;</td>
				<td><input type="password" value="" class="text2"
					name="repassword" id="repasswordid"></td>
			</tr>

			<tr>
				<td width="100" height="40" align="right">&nbsp;</td>
				<td><input type="submit" value="注册" /></td>
			</tr>
		</table>
	</form>
</body>
</html>