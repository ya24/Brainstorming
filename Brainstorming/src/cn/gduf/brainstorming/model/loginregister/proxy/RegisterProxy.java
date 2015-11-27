package cn.gduf.brainstorming.model.loginregister.proxy;
/**
 * ע�������
 * @author ��˼
 */
import java.sql.SQLException;

import cn.gduf.brainstorming.model.dbc.DatabaseConnection;
import cn.gduf.brainstorming.model.loginregister.dao.RegisterDAO;
import cn.gduf.brainstorming.model.loginregister.dao.impl.RegisterDAOImpl;
import cn.gduf.brainstorming.model.vo.User;

public class RegisterProxy implements RegisterDAO {
	
	private DatabaseConnection dbc=null;
	private RegisterDAO dao=null;
	
	/**
	 * �����ݿ�����
	 */
	public RegisterProxy(){
		dbc=new DatabaseConnection();
		dao=new RegisterDAOImpl(dbc.getConnection());
	}

	/**
	 * ����û���Ϣ
	 * @param user
	 * @throws SQLException 
	 */
	@Override
	public boolean insertUserInfo(User user) throws SQLException {
		boolean flag=false;
		
		try {
			flag=dao.insertUserInfo(user);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				dbc.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return flag;
	}

}
