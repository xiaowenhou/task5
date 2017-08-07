<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title><tiles:getAsString name="title" /></title>
<meta content="width=device-width, initial-scale=1.0" name="viewport" charset="UTF-8">
<link rel="stylesheet" href="http://apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.min.css">
<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script src="http://apps.bdimg.com/libs/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<link href="../view/css/t11.css" rel="stylesheet" type="text/css">
<link href="../view/css/base.css" rel="stylesheet" type="text/css">
</head>
<!-- 定义模版样式 -->
<body>
		<tiles:insertAttribute name="header" />
		 <div class="container">
			<tiles:insertAttribute name="menu" />
			<tiles:insertAttribute name="body" />
		</div>
		<tiles:insertAttribute name="footer" />
</body>
</html>

