package cn.gduf.brainstorming.model.post.dao;

import java.sql.SQLException;
import java.util.List;

import cn.gduf.brainstorming.model.vo.Answer;

/**
 * @author ��˼
 * �����ӿ���
 */
public interface RePostDAO {
	public List<Answer> showRePostByUserID(Answer answer) throws SQLException;
	public List<Answer> showRePostByArticleID(Answer answer) throws SQLException;
	public boolean createRePost(Answer answer) throws SQLException;
}
