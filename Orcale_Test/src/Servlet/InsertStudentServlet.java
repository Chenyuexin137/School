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
		//��ȡҳ������
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String major = request.getParameter("major");
		String age = request.getParameter("age");
		int age_int = Integer.parseInt(age);
		//�洢��ʵ����
		Student student = new Student();
		student.setרҵ(major);
		student.set����(name);
		student.setѧ��(id);
		student.set����(age_int);
		student.set�Ա�(sex);
		
		Operate_Student_info stu = new Operate_Student_info();
		int num = stu.InsertStudent(student);
		
		if(num>0)
		{
			System.out.println(student.get����()+"������ӳɹ�");
		}
		else
		{
			System.out.println("�������ʧ��");
		}
	}
}
