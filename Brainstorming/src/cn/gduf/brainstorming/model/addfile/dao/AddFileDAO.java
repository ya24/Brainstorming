package cn.gduf.brainstorming.model.addfile.dao;

import java.sql.SQLException;
import java.util.List;

import cn.gduf.brainstorming.model.vo.Addfile;

/**
 * @author ��˼
 * �����ӿ���
 */
public interface AddFileDAO {
	public boolean createAddfile(Addfile addfile) throws SQLException;
	public List<Addfile> showAddfile(Addfile addfile) throws SQLException;
}
