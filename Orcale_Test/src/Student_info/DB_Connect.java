package Student_info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connect {
	//驱动地址
		static String driver = "oracle.jdbc.driver.OracleDriver";
		//链接地址
		static String url="jdbc:oracle:thin:@localhost:1521:xueshengxuan";
		//用户名
		static String user = "cdd";
		//密码
		static String password = "test";
		//创建一个加载驱动的方法
		static {
			try {
				Class.forName(driver);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		//数据库链接
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
				System.out.println("数据库链接成功");
			}
		}
}
