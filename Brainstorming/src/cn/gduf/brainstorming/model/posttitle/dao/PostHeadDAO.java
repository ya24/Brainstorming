package cn.gduf.brainstorming.model.posttitle.dao;
/**
 * ��ʾ����ͷ�����ݽӿ���
 */
import java.sql.SQLException;
import java.util.List;

import cn.gduf.brainstorming.model.vo.AtTpUs3;

public interface PostHeadDAO {
	/**
	 * ��ʾ��������
	 * 
	 * @return vo���������Article��TopicType��User
	 * @throws SQLException 
	 * @throws Exception 
	 */
	public List<AtTpUs3> findPopularPost() throws SQLException, Exception;

	/**
	 * �����û�ID��������
	 * 
	 * @return vo���������Article��TopicType��User
	 * @throws Exception 
	 */
	public List<AtTpUs3> findPostByUserID(String userID) throws Exception;

	/**
	 * ��������ID��������
	 * 
	 * @return vo���������Article��TopicType��User
	 * @throws Exception 
	 */
	public List<AtTpUs3> findPostByTypeID(int typeID) throws Exception;

	/**
	 * �����û��ղص�����
	 * 
	 * @return vo���������Article��TopicType��User
	 * @throws Exception 
	 */
	public List<AtTpUs3> findPostByFavorUserID(String userID) throws Exception;
}
