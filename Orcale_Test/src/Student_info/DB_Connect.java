package Student_info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connect {
	//������ַ
		static String driver = "oracle.jdbc.driver.OracleDriver";
		//���ӵ�ַ
		static String url="jdbc:oracle:thin:@localhost:1521:xueshengxuan";
		//�û���
		static String user = "cdd";
		//����
		static String password = "test";
		//����һ�����������ķ���
		static {
			try {
				Class.forName(driver);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		//���ݿ�����
		public static Connection getconn() {
			Connection conn = null;
			try {
				 conn = DriverManager.getConnection(url,user,password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
		}		
		public static void main(String[] args) {
			Connection conn = getconn();
			if(conn!=null) {
				System.out.println("���ݿ����ӳɹ�");
			}
		}
}
