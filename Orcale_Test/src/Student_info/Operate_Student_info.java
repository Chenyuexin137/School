package Student_info;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Student_info.DB_Connect;

public class Operate_Student_info {
	public List<Student> selectStudent() {
		//获取链接
		Connection conn = DB_Connect.getconn();
		List<Student> students = null;
		//异常捕获
		try {
			//准备声明
			PreparedStatement pre = conn.prepareStatement("select * from 学生");
			//executeQuery执行查询方法
			ResultSet  rs =	pre.executeQuery();
		    
			students = new ArrayList<>();
			while(rs.next()) {
				//获取数据
				Student student = new Student();
				student.set学号(rs.getString(1));
				student.set姓名(rs.getString(2));
				student.set性别(rs.getString(3));
				student.set专业(rs.getString(4));
				student.set年龄(rs.getInt(5));
				//存储到list集合里面
				students.add(student);
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return students;
	}
	public int InsertStudent(Student S) {
		//获取链接
		Connection conn = DB_Connect.getconn();
		//异常捕获
		try {
			//准备声明
			PreparedStatement pre = conn.prepareStatement("insert into 学生(学号,姓名,性别,专业,年龄) values(?,?,?,?,?)");
			pre.setString(1, S.get学号());
			pre.setString(2, S.get姓名());
			pre.setString(3, S.get性别());
			pre.setString(4, S.get专业());
			pre.setInt(5, S.get年龄());
			
			int num = pre.executeUpdate();
			return num;
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}
	public int DeleteStudent(String id)	{
		Connection conn = DB_Connect.getconn();
		try {
			String sql="delete from 学生 where 学号="+id;
			PreparedStatement pre = conn.prepareStatement(sql);
			
			int num = pre.executeUpdate();
			return num;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
