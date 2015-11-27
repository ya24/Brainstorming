package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.gduf.brainstorming.model.dbc.DatabaseConnection;
import cn.gduf.brainstorming.model.factory.DAOFactory;
import cn.gduf.brainstorming.model.vo.User;

public class LoginDAOTest {

	public static void main(String[] args) throws SQLException {
		
		method1();
//		method2();
	}

	
	private static void method2() throws SQLException {
		Connection conn=new DatabaseConnection().getConnection();
		String sql="select userID,userName,userPassword,userEmail,picturePath from t_user where userID=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, "000000002 ");
		ResultSet rs=ps.executeQuery();
		System.out.println(rs);
		System.out.println(rs.getString("userID"));
		System.out.println(rs.getString("userName"));
		System.out.println(rs.getString("userPassword"));
		System.out.println(rs.getString("userEmail"));
		System.out.println(rs.getString("picturePath"));
	}

	private static void method1() throws SQLException {
		/*
		 * 登录验证，根据用户ID找登录信息
		 * select userID,userName,userPassword,userEmail,picturePath"
				+ "from t_user where userID=?
		 */
		User u=new User();
		u.setUserID("000000002");
		User u2=DAOFactory.getLoginDAOInstance().findByUserID(u);
		System.out.println(u2);
//		System.out.println(u2.getUserID());
//		System.out.println(u2.getUserName());
//		System.out.println(u2.getUserPassword());
//		System.out.println(u2.getUserEmail());
//		System.out.println(u2.getPicturePath());
		if("陈铭锋".equals(u2.getUserName()) && "111111".equals(u2.getUserPassword())){
			System.out.println("信息准确");
		}else{
			System.out.println("信息错误");
		}
		
	}

}
