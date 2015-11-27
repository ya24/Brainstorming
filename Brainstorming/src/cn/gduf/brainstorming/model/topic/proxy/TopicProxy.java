package cn.gduf.brainstorming.model.topic.proxy;

/**
 * @author ��˼
 * ���������
 */
import java.sql.SQLException;
import java.util.List;

import cn.gduf.brainstorming.model.dbc.DatabaseConnection;
import cn.gduf.brainstorming.model.topic.dao.TopicDAO;
import cn.gduf.brainstorming.model.topic.dao.impl.TopicDAOImpl;
import cn.gduf.brainstorming.model.vo.Major;
import cn.gduf.brainstorming.model.vo.Theme;

public class TopicProxy implements TopicDAO {

	DatabaseConnection dbc = null;
	TopicDAO dao = null;

	/**
	 * �����ݿ�����
	 */
	public TopicProxy() {
		dbc = new DatabaseConnection();
		dao = new TopicDAOImpl(dbc.getConnection());
	}

	/**
	 * ��ʾ�û�����Ȥ�Ļ���
	 * 
	 * @param theme
	 * @throws SQLException
	 */
	@Override
	public List<Major> showUserLoveTopic(Theme theme) throws SQLException {
		List<Major> list = null;

		try {
			list=dao.showUserLoveTopic(theme);
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

	/**
	 * ����û�����Ȥ�Ļ���
	 * 
	 * @param theme
	 * @throws SQLException
	 */
	@Override
	public boolean insertUserLoveTopic(Theme theme) throws SQLException {
		boolean flag = false;

		try {
			flag=dao.insertUserLoveTopic(theme);
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
	 * ��ʾ��������
	 * 
	 * @param major
	 * @throws SQLException
	 */
	@Override
	public Major showSingleTopic(Major major) throws SQLException {
		Major major2 = null;

		try {
			major2=dao.showSingleTopic(major);
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

		return major2;
	}

	/**
	 * ��ʾ����漰�Ļ���
	 * 
	 * @throws SQLException
	 */
	@Override
	public List<Major> showAllTopic() throws SQLException {
		List<Major> list = null;

		try {
			list=dao.showAllTopic();
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
