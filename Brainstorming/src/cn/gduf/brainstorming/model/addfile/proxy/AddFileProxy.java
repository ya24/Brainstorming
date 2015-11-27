package cn.gduf.brainstorming.model.addfile.proxy;

/**
 * ����������
 * @author ��˼
 */
import java.sql.SQLException;
import java.util.List;

import cn.gduf.brainstorming.model.addfile.dao.AddFileDAO;
import cn.gduf.brainstorming.model.addfile.dao.impl.AddFileDAOImpl;
import cn.gduf.brainstorming.model.dbc.DatabaseConnection;
import cn.gduf.brainstorming.model.vo.Addfile;

public class AddFileProxy implements AddFileDAO {

	private DatabaseConnection dbc = null;
	private AddFileDAO dao = null;

	/**
	 * �����ݿ�
	 */
	public AddFileProxy() {
		dbc = new DatabaseConnection();
		dao = new AddFileDAOImpl(dbc.getConnection());
	}

	/**
	 * ��Ӹ���
	 * 
	 * @param addfile
	 */
	@Override
	public boolean createAddfile(Addfile addfile) throws SQLException {
		boolean flag = false;

		try {
			flag=dao.createAddfile(addfile);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				dbc.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return flag;
	}

	/**
	 * ��ʾ����(�������ͬһ���ӵĸ���������articleID����ʾ���������ƣ������ϴ�ʱ��)
	 * 
	 * @param addfile
	 */
	@Override
	public List<Addfile> showAddfile(Addfile addfile) throws SQLException {
		List<Addfile> list = null;

		try {
			list=dao.showAddfile(addfile);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				dbc.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return list;
	}

}
