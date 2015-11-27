package test;

import java.sql.SQLException;

import cn.gduf.brainstorming.model.factory.DAOFactory;
import cn.gduf.brainstorming.model.vo.User;

public class RegisterDAOTest {

	public static void main(String[] args) throws SQLException {
		/*
		 * ����û���Ϣ
		 * insert into t_user(userID,userName,userPassword,userEmail)"
				+ "values(?,?,?,?)"
		 */
		User u=new User();
		u.setUserID("000000005");
		u.setUserName("aaa");
		u.setUserPassword("111111");
		u.setUserEmail("@qq.com");
		
		boolean flag=DAOFactory.getRegisterDAOInstance().insertUserInfo(u);
		System.out.println(flag);
	}

}
