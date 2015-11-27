package cn.gduf.brainstorming.model.agree.proxy;

/**
 * @author ��˼
 * �޵ĸ���������
 */
import java.sql.SQLException;

import cn.gduf.brainstorming.model.agree.dao.AgreeCounterDAO;
import cn.gduf.brainstorming.model.agree.dao.impl.AgreeCounterDAOImpl;
import cn.gduf.brainstorming.model.dbc.DatabaseConnection;
import cn.gduf.brainstorming.model.vo.Answer;
import cn.gduf.brainstorming.model.vo.Article;

public class AgreeCounterProxy implements AgreeCounterDAO {

	private DatabaseConnection dbc = null;
	private AgreeCounterDAO dao = null;

	/**
	 * �����ݿ�
	 */
	public AgreeCounterProxy() {
		dbc = new DatabaseConnection();
		dao = new AgreeCounterDAOImpl(dbc.getConnection());
	}

	/**
	 * ���������޵ĸ���
	 * 
	 * @param article
	 * @throws SQLException
	 */
	@Override
	public Article findByArticleID(Article article) throws SQLException {
		Article article2 = null;

		try {
			article2=dao.findByArticleID(article);
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

		return article2;
	}

	/**
	 * �޸������޵ĸ���
	 * 
	 * @param article
	 * @throws SQLException
	 */
	@Override
	public boolean modifyByArticleID(Article article) throws SQLException {
		boolean flag = false;

		try {
			flag=dao.modifyByArticleID(article);
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
	 * ���һ����޵ĸ���
	 * 
	 * @param answer
	 * @throws SQLException
	 */
	@Override
	public Answer findByAnswerID(Answer answer) throws SQLException {
		Answer answer2 = null;

		try {
			answer2=dao.findByAnswerID(answer);
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

		return answer2;
	}

	/**
	 * �޸Ļ����޵ĸ���
	 * 
	 * @param answer
	 * @throws SQLException
	 */
	@Override
	public boolean modifyByAnswerID(Answer answer) throws SQLException {
		boolean flag = false;

		try {
			flag=dao.modifyByAnswerID(answer);
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
