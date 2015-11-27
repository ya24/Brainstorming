package cn.gduf.brainstorming.model.post.proxy;

/**
 * @author ��˼
 * ��ʾ������ϸ���ݴ�����
 */
import java.sql.SQLException;

import cn.gduf.brainstorming.model.dbc.DatabaseConnection;
import cn.gduf.brainstorming.model.post.dao.PostTextDAO;
import cn.gduf.brainstorming.model.post.dao.impl.PostTextDAOImpl;
import cn.gduf.brainstorming.model.vo.Article;
import cn.gduf.brainstorming.model.vo.AtUsShMjAnTpFl7;

public class PostTextProxy implements PostTextDAO {

	private DatabaseConnection dbc = null; // ���ݿ����Ӷ���
	private PostTextDAO dao = null; // ��ʾ������ϸ���ݽӿ���

	/**
	 * ���췽���������ݿ��ʵ�ֽӿ�
	 */
	public PostTextProxy() {
		this.dbc = new DatabaseConnection(); // ȡ�����ݿ����Ӷ���
		this.dao = new PostTextDAOImpl(this.dbc.getConnection()); // ʵ����������ϸ���ݽӿ�ʵ����
	}

	@Override
	public AtUsShMjAnTpFl7 findPostByURL(Article article) throws SQLException {
		// ʵ����
		AtUsShMjAnTpFl7 vo7 = null;

		try {

			vo7 = dao.findPostByURL(article);

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
		return vo7;
	}

}
