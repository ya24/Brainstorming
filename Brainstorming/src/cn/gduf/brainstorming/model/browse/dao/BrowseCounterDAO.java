package cn.gduf.brainstorming.model.browse.dao;
/**
 * @author ��˼
 * ������������ӿ���
 */
import java.sql.SQLException;

import cn.gduf.brainstorming.model.vo.Article;


public interface BrowseCounterDAO {
	public Article findByArticleID(Article article) throws SQLException;
	public boolean modifyByArticleID(Article article) throws SQLException;
}
