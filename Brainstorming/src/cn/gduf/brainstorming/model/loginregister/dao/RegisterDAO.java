package cn.gduf.brainstorming.model.loginregister.dao;
/**
 * ע��ӿ���
 * @author ��˼
 *
 */
import java.sql.SQLException;

import cn.gduf.brainstorming.model.vo.User;


public interface RegisterDAO {
	public boolean insertUserInfo(User user) throws SQLException;
}
