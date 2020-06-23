package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Student_info.Operate_Student_info;


@WebServlet("/DeleteStudentServlet")
public class DeleteStudentServlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取页面数据
		String id = request.getParameter("id");
		
		Operate_Student_info stu = new Operate_Student_info();
		int num = stu.DeleteStudent(id);
		System.out.println(id);
	
		
		if(num>0)
		{
			System.out.println(id+"数据删除成功");
		}
		else
		{
			System.out.println("数据删除失败");
		}
	}
}
