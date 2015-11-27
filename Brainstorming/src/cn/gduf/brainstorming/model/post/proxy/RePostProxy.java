package cn.gduf.brainstorming.model.post.proxy;

/**
 * @author ��˼
 * ����������
 */
import java.sql.SQLException;
import java.util.List;

import cn.gduf.brainstorming.model.dbc.DatabaseConnection;
import cn.gduf.brainstorming.model.post.dao.RePostDAO;
import cn.gduf.brainstorming.model.post.dao.impl.RePostDAOImpl;
import cn.gduf.brainstorming.model.vo.Answer;

public class RePostProxy implements RePostDAO {

	private DatabaseConnection dbc = null; // ���ݿ����Ӷ���
	private RePostDAO dao = null;

	/**
	 * ���췽���������ݿ��ʵ�ֽӿ�
	 */
	public RePostProxy() {
		this.dbc = new DatabaseConnection(); // ȡ�����ݿ����Ӷ���
		this.dao = new RePostDAOImpl(this.dbc.getConnection());
	}

	/**
	 * �鿴�������û�������
	 * 
	 * @param answer
	 * @throws SQLException
	 */
	@Override
	public List<Answer> showRePostByUserID(Answer answer) throws SQLException {
		List<Answer> list = null;
		try {
			list = dao.showRePostByUserID(answer);
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
	 * �鿴���������ӻ�����
	 * 
	 * @param answer
	 * @throws SQLException
	 */
	@Override
	public List<Answer> showRePostByArticleID(Answer answer)
			throws SQLException {
		List<Answer> list = null;
		try {
			list = dao.showRePostByArticleID(answer);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				dbc.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return list;
		
	}
	

	@Override
	public boolean createRePost(Answer answer) throws SQLException {

		boolean flag = false;

		try {
			flag = dao.createRePost(answer);
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

}
