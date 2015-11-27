package cn.gduf.brainstorming.model.browse.proxy;

/**
 * @author ��˼
 * �����������������
 */
import java.sql.SQLException;

import cn.gduf.brainstorming.model.browse.dao.BrowseCounterDAO;
import cn.gduf.brainstorming.model.browse.dao.impl.BrowseCounterDAOImpl;
import cn.gduf.brainstorming.model.dbc.DatabaseConnection;
import cn.gduf.brainstorming.model.vo.Article;

public class BrowseCounterProxy implements BrowseCounterDAO {

	private DatabaseConnection dbc = null;
	private BrowseCounterDAO dao = null;

	/**
	 * �����ݿ�
	 */
	public BrowseCounterProxy() {
		dbc = new DatabaseConnection();
		dao = new BrowseCounterDAOImpl(dbc.getConnection());
	}

	/**
	 * ���������������
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
	 * �޸������������
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

}
