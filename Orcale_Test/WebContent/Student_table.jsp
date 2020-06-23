<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="Student_info.Operate_Student_info" %>
<%@ page import="java.util.*" %>
<%@ page import="Student_info.Student" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>学生信息</title>
</head>
<body>
	<%
	Operate_Student_info S = new Operate_Student_info();
	List<Student> students = S.selectStudent();
	%>
	 <table border="1">
		<tr>
			<th>学生编号</th>
			<th>学生姓名</th>
			<th>学生性别</th>
			<th>学生专业</th>
			<th>学生年龄</th>
			<th>操作</th>
		</tr>
		
		<% for(int i=0;i<students.size();i++) {%>
		<tr>
		
			<td><%=students.get(i).get学号() %></td>
			<td><%=students.get(i).get姓名() %></td>
			<td><%=students.get(i).get性别() %></td>
			<td><%=students.get(i).get专业() %></td>
			<td><%=students.get(i).get年龄() %></td>
			<td><a href="DeleteStudentServlet?id=<%=students.get(i).get学号()%>">删除</a><a>修改</a></td>
		</tr>
		<%
		}
		%>
	</table>
	<a href="IsertIntoStudent.jsp">
	<button type="button" >添加</button>
	</a>
</body>
</html>