<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>新增学生表数据</title>
</head>
<body>
	<form action="InsertStudentServlet">
		学号<input type="text" name="id"/><br>
		姓名<input type="text" name="name"/><br>
		性别<input type="text" name="sex"/><br>
		专业<input type="text" name="major"/><br>
		年龄<input type="text" name="age"/><br>
		<input type="submit" value="添加数据库表student" /><br>
		
	</form>
</body>
</html>