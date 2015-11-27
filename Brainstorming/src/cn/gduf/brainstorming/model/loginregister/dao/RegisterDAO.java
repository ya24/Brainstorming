package cn.gduf.brainstorming.model.loginregister.dao;
/**
 * 注册接口类
 * @author 集思
 *
 */
import java.sql.SQLException;

import cn.gduf.brainstorming.model.vo.User;


public interface RegisterDAO {
	public boolean insertUserInfo(User user) throws SQLException;
}
