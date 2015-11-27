package cn.gduf.brainstorming.model.dbc;
/**
 * sql server数据库连接信息
 * @author 集思
 */
public class Constants {

	//sql server数据库驱动程序
	public static final String DRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		
	//sql server数据库URL模式
	public static final String URL="jdbc:sqlserver://localhost:1433;DatabaseName=BrainstormingInfo";
	
	//登录数据库使用的用户名
	public static final String USERNAME="sa";
	
	//登录数据库使用的密码
	public static final String PASSWORD="123456";
	
}
