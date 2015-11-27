package cn.gduf.brainstorming.model.post.dao;

import java.sql.SQLException;

import cn.gduf.brainstorming.model.vo.Article;

/**
 * @author 集思
 * 发帖接口类
 */
public interface CreatePostDAO {
	public boolean createPost(Article article) throws SQLException;
}
