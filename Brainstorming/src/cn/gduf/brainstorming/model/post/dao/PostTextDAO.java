package cn.gduf.brainstorming.model.post.dao;

import java.sql.SQLException;

import cn.gduf.brainstorming.model.vo.Article;
import cn.gduf.brainstorming.model.vo.AtUsShMjAnTpFl7;

/**
 * @author ��˼
 * ��ʾ������ϸ���ݽӿ���
 */
public interface PostTextDAO {
	public AtUsShMjAnTpFl7 findPostByURL(Article article) throws SQLException;
}
