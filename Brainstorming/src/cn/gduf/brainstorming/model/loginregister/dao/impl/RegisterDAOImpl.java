package cn.gduf.brainstorming.model.loginregister.dao.impl;
/**
 * 注册接口实现类
 * @author 集思
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cn.gduf.brainstorming.model.loginregister.dao.RegisterDAO;
import cn.gduf.brainstorming.model.vo.User;

public class RegisterDAOImpl implements RegisterDAO {

	private Connection conn=null;
	private PreparedStatement ps=null;
	
	/**
	 * 取得数据库连接
	 * @param conn
	 */
	public RegisterDAOImpl(Connection conn){
		this.conn=conn;
	}
	
	/**
	 * 添加用户信息
	 * @param user
	 * @throws SQLException 
	 */
	@Override
	public boolean insertUserInfo(User user) throws SQLException {
		boolean flag=false;
		
		String sql="insert into t_user(userID,userName,userPassword,userEmail) values(?,?,?,?)";
		
		ps=conn.prepareStatement(sql);
		
		ps.setString(1, user.getUserID());
		ps.setString(2, user.getUserName());
		ps.setString(3, user.getUserPassword());
		ps.setString(4, user.getUserEmail());
		
		int count=ps.executeUpdate();
		
		if(count==1){
			flag=true;
		}
		
		ps.close();
		
		return flag;
	}

}
