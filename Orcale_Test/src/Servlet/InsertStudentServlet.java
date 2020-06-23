package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Student_info.Operate_Student_info;
import Student_info.Student;


@WebServlet("/InsertStudentServlet")
public class InsertStudentServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取页面数据
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String major = request.getParameter("major");
		String age = request.getParameter("age");
		int age_int = Integer.parseInt(age);
		//存储到实体类
		Student student = new Student();
		student.set专业(major);
		student.set姓名(name);
		student.set学号(id);
		student.set年龄(age_int);
		student.set性别(sex);
		
		Operate_Student_info stu = new Operate_Student_info();
		int num = stu.InsertStudent(student);
		
		if(num>0)
		{
			System.out.println(student.get姓名()+"数据添加成功");
		}
		else
		{
			System.out.println("数据添加失败");
		}
	}
}
