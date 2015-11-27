package cn.gduf.brainstorming.model.loginregister.dao.impl;

/**
 * ��½�ӿ�ʵ����
 * @author ��˼
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.gduf.brainstorming.model.loginregister.dao.LoginDAO;
import cn.gduf.brainstorming.model.vo.User;

public class LoginDAOImpl implements LoginDAO {
	
	private Connection conn=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	
	/**
	 * ȡ�����ݿ�����
	 * @param conn
	 */
	public LoginDAOImpl(Connection conn){
		this.conn=conn;
	}

	/**
	 * ��¼��֤�������û�ID�ҵ�¼��Ϣ
	 * 
	 * @param user
	 * @throws SQLException 
	 */
	@Override
	public User findByUserID(User user) throws SQLException {
		User user2 = new User();

		String sql="select userID,userName,userPassword,userEmail,picturePath "
				+ "from t_user where userID=?";
		
		ps=conn.prepareStatement(sql);
		
		ps.setString(1, user.getUserID());
		
		rs=ps.executeQuery();
		
		while(rs.next()){
			user2.setUserID(rs.getString("userID"));
			user2.setUserName(rs.getString("userName"));
			user2.setUserPassword(rs.getString("userPassword"));
			user2.setUserEmail(rs.getString("userEmail"));
			user2.setPicturePath(rs.getString("picturePath"));
		}
		
		rs.close();
		ps.close();
		
		return user2;
	}

	/**
	 * ��¼��֤�������û����ҵ�¼��Ϣ
	 * 
	 * @param user
	 * @throws SQLException 
	 */
	@Override
	public User findByName(User user) throws SQLException {
		User user2 = new User();

		String sql="select userID,userName,userPassword,userEmail,picturePath from t_user where userName=?";
		
		ps=conn.prepareStatement(sql);
		
		ps.setString(1, user.getUserName());
		
		rs=ps.executeQuery();
		
		while(rs.next()){
			user2.setUserID(rs.getString("userID"));
			user2.setUserName(rs.getString("userName"));
			user2.setUserPassword(rs.getString("userPassword"));
			user2.setUserEmail(rs.getString("userEmail"));
			user2.setPicturePath(rs.getString("picturePath"));
		}
		
		rs.close();
		ps.close();
		
		
		return user2;

	}

	/**
	 * ��¼��֤�������û������ҵ�¼��Ϣ
	 * 
	 * @param user
	 * @throws SQLException 
	 */
	@Override
	public User findByEmail(User user) throws SQLException {
		User user2 = new User();

		String sql="select userID,userName,userPassword,userEmail,picturePath"
				+ "from t_user where userEmail=?";
		
		ps=conn.prepareStatement(sql);
		
		ps.setString(1, user.getUserEmail());
		
		rs=ps.executeQuery();
		
		while(rs.next()){
			user2.setUserID(rs.getString("userID"));
			user2.setUserName(rs.getString("userName"));
			user2.setUserPassword(rs.getString("userPassword"));
			user2.setUserEmail(rs.getString("userEmail"));
			user2.setPicturePath(rs.getString("picturePath"));
		}
		
		rs.close();
		ps.close();
		
		
		return user2;

	}

}
