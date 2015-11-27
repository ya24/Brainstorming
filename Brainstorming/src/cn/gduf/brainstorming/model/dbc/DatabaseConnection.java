package cn.gduf.brainstorming.model.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author 集思
 * 负责数据库打开与关闭操作
 */
public class DatabaseConnection {
	
	private Connection conn=null;
	
	public DatabaseConnection(){
		try {
			// 加载驱动程序
			Class.forName(Constants.DRIVER);
			//连接数据库
			conn = DriverManager.getConnection(Constants.URL,
					Constants.USERNAME, Constants.PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return conn;

	}
	
	/**
	 * 关闭数据库的连接
	 * @throws Exception
	 */
	public void close() throws Exception{
		if(this.conn != null){
			try{
				this.conn.close() ;
			}catch(Exception e){
				throw e ;
			}
		}
	}
}
