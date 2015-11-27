package cn.gduf.brainstorming.model.loginregister.dao;
/**
 * ��½�ӿ���
 * @author ��˼
 *
 */
import java.sql.SQLException;

import cn.gduf.brainstorming.model.vo.User;

public interface LoginDAO {
	public User findByUserID(User user) throws SQLException;
	public User findByName(User user) throws SQLException;
	public User findByEmail(User user) throws SQLException;
}
