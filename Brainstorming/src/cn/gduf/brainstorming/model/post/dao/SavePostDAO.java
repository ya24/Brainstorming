package cn.gduf.brainstorming.model.post.dao;

import java.sql.SQLException;

import cn.gduf.brainstorming.model.vo.Favorite;

/**
 * @author ��˼
 * �ղ����ӽӿ���
 */
public interface SavePostDAO {
	public boolean createSavePost(Favorite favorite) throws SQLException;
}
