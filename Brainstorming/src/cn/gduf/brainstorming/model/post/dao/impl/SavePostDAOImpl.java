package cn.gduf.brainstorming.model.post.dao.impl;
/**
 * @author ��˼
 * �ղ����ӽӿ�ʵ����
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cn.gduf.brainstorming.model.post.dao.SavePostDAO;
import cn.gduf.brainstorming.model.vo.Favorite;

public class SavePostDAOImpl implements SavePostDAO {

	private Connection conn = null; 
	private PreparedStatement ps = null; 
	
	public  SavePostDAOImpl(Connection conn){
		this.conn=conn;
	}

	/**
	 * �����ղ�����
	 * 
	 * @param favorite
	 * @throws SQLException
	 */
	@Override
	public boolean createSavePost(Favorite favorite) throws SQLException {

		boolean flag = false;

		String sql = "insert into favorite(userID,articleID) values(?,?)";

		ps = conn.prepareStatement(sql);

		ps.setString(1, favorite.getUserID());
		ps.setString(2, favorite.getArticleID());

		int count = ps.executeUpdate();
		
		if (count == 1) {
			flag = true;
		}

		ps.close();

		return flag;
	}

}
