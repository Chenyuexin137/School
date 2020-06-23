package Student_info;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Student_info.DB_Connect;

public class Operate_Student_info {
	public List<Student> selectStudent() {
		//��ȡ����
		Connection conn = DB_Connect.getconn();
		List<Student> students = null;
		//�쳣����
		try {
			//׼������
			PreparedStatement pre = conn.prepareStatement("select * from ѧ��");
			//executeQueryִ�в�ѯ����
			ResultSet  rs =	pre.executeQuery();
		    
			students = new ArrayList<>();
			while(rs.next()) {
				//��ȡ����
				Student student = new Student();
				student.setѧ��(rs.getString(1));
				student.set����(rs.getString(2));
				student.set�Ա�(rs.getString(3));
				student.setרҵ(rs.getString(4));
				student.set����(rs.getInt(5));
				//�洢��list��������
				students.add(student);
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return students;
	}
	public int InsertStudent(Student S) {
		//��ȡ����
		Connection conn = DB_Connect.getconn();
		//�쳣����
		try {
			//׼������
			PreparedStatement pre = conn.prepareStatement("insert into ѧ��(ѧ��,����,�Ա�,רҵ,����) values(?,?,?,?,?)");
			pre.setString(1, S.getѧ��());
			pre.setString(2, S.get����());
			pre.setString(3, S.get�Ա�());
			pre.setString(4, S.getרҵ());
			pre.setInt(5, S.get����());
			
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
			String sql="delete from ѧ�� where ѧ��="+id;
			PreparedStatement pre = conn.prepareStatement(sql);
			
			int num = pre.executeUpdate();
			return num;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
