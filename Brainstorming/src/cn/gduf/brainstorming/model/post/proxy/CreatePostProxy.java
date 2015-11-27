package cn.gduf.brainstorming.model.post.proxy;

/**
 * @author ��˼
 * ����������
 */
import java.sql.SQLException;

import cn.gduf.brainstorming.model.dbc.DatabaseConnection;
import cn.gduf.brainstorming.model.post.dao.CreatePostDAO;
import cn.gduf.brainstorming.model.post.dao.impl.CreatePostDAOImpl;
import cn.gduf.brainstorming.model.vo.Article;

public class CreatePostProxy implements CreatePostDAO {

	private DatabaseConnection dbc = null;
	private CreatePostDAO dao = null;

	public CreatePostProxy() {
		dbc = new DatabaseConnection();
		dao = new CreatePostDAOImpl(dbc.getConnection());
	}

	@Override
	public boolean createPost(Article article) throws SQLException {
		boolean flag = false;

		try {
			flag = dao.createPost(article);
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
